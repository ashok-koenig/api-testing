import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FileUploadTest {

    @Test
    public void uploadFile(){
        File file = new File("src/main/resources/sample.txt");

        Response response = given()
                .multiPart("file", file)
                .when()
                .post("https://api.escuelajs.co/api/v1/files/upload")
                .then()
                .statusCode(201)
                .body("originalname", equalTo("sample.txt"))
                .extract().response();

        // Extract file url returned by API
        String fileUrl = response.path("location");
        System.out.println("Uploaded file URL: "+ fileUrl);
    }
}
