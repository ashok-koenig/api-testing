import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UsersAPITest {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://localhost:3000";
    }

    @Test
    public void getUser(){
        given().log().all()
                .when()
                .get("/users/1")
                .then().statusCode(200)
                .body("id",equalTo(1));
    }

    @Test
    public void createUser(){
        Map<String, String> newUser = new HashMap<>();
        newUser.put("name", "Ana");
        newUser.put("email", "ana@email.com");

        given()
                .header("Content-Type", "application/json")
                .body(newUser)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Ana"));
    }

    @Test
    public void updateUser(){
        Map<String, String> editedUser = new HashMap<>();
        editedUser.put("name", "Ana Smith");
        editedUser.put("email", "anasmith@email.com");

        given()
                .header("Content-Type", "application/json")
                .body(editedUser)
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .body("name", equalTo(editedUser.get("name")));
    }

    @Test
    public void deleteUser(){
        given().when().delete("/users/3").then().statusCode(200);
    }
}
