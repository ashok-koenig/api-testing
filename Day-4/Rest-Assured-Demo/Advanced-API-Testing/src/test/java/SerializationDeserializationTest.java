import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class SerializationDeserializationTest {

    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "http://localhost:3000";
    }

    @Test
    public void serializationTest(){
        // Serialization: Java Object -> JSON Request
        User newUser = new User("Raja", "raja@email.com");
        given()
                .header("Content-Type", "application/json")
                .body(newUser)
                .when()
                .post("/users")
                .then()
                .statusCode(201).body("name", equalTo("Raja"));
    }

    @Test
    public void deserializationTest(){
        // Deserialization: JSON Response to Java Object
        User userResponse = given().get("/users/1").as(User.class);

        System.out.println("ID: "+ userResponse.getId());
        System.out.println("Name: "+ userResponse.getName());
        System.out.println("Email: "+ userResponse.getEmail());

    }
}
