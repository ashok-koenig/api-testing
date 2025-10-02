import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class JsonParsingTest {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://localhost:3000";
    }

    @Test
    public void getUser(){
        Response response = given().get("/users/1");

        // Get as string
        String resString = response.asString();
        System.out.println("Response: "+ resString);

        // Extract individual fields
        int id = response.path("id");
        String name = response.path("name");
        String email = response.path("email");

        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Email: "+ email);

        // Assertions
        response.then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("email", equalTo("john@email.com"));
    }

    @Test
    public void getAllUsers(){
        Response response = given().get("/users");

        JsonPath jsonPath = response.jsonPath();

        // Extract first user's name
        String name = jsonPath.getString("[0].name");
        System.out.println("First user name: " + name);

        // Extract all names
        List<String> allNames = jsonPath.getList("name");
        System.out.println("All names: "+ allNames);
    }
}
