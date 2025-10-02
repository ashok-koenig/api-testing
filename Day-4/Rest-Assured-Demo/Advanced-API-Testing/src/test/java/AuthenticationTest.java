import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthenticationTest {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationTest.class);

    @Test
    public void basicAuthTest(){

        given().when().get("https://postman-echo.com/basic-auth").then().statusCode(401);

        given()
                .auth()
                .preemptive()
                .basic("postman", "password")
                .get("https://postman-echo.com/basic-auth")
                .then()
                .statusCode(200)
                .body("authenticated", equalTo(true));

    }

    @Test
    public void bearerTokenAuthTest(){
        // Login to get token
        Map<String, String> loginPayload = new HashMap<>();
        loginPayload.put("email", "john@mail.com");
        loginPayload.put("password", "changeme");
        Response loginResponse = given()
                .header("Content-Type", "application/json")
                .body(loginPayload)
                .when()
                .post("https://api.escuelajs.co/api/v1/auth/login")
                .then().extract().response();

        String token = loginResponse.path("access_token");
        System.out.println("Bearer token: "+ token);

        // Get the user profile using Bearer token
        given()
                .header("Authorization", "Bearer "+ token)
                .when()
                .get("https://api.escuelajs.co/api/v1/auth/profile")
                .then().statusCode(200).log().all();
    }
}
