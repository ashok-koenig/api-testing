import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidationTest {
    @Test
    public void validateUserSchema(){
        given()
                .when()
                .get("http://localhost:3000/users/1")
                .then()
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchemaInClasspath("user-schema.json"));
    }
}
