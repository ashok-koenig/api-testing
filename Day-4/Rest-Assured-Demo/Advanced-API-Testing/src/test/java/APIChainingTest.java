import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APIChainingTest {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://localhost:3000";
    }

    @Test
    public void usersAPIChainingTest(){
        // Step 1: Get all users
        Response response = given().when().get("/users").then().extract().response();

        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("[1].id");
        String name = jsonPath.getString("[1].name");
        String email = jsonPath.getString("[1].email");

        // Step 2: Get single user using the extracted id
        given().pathParam("id", id).when().get("/users/{id}").then().statusCode(200)
                .body("name", equalTo(name)).body("email",equalTo(email)).log().body();

    }
}
