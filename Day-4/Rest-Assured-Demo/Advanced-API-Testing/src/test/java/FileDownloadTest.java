import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.InputStream;

import static io.restassured.RestAssured.given;

public class FileDownloadTest {

    @Test
    public void downloadFile() throws Exception{
        Response response = given()
                .get("https://api.escuelajs.co/api/v1/files/d7cc.txt")
                .then()
                .statusCode(200)
                .extract().response();
        // Save to local file
        InputStream inputStream = response.asInputStream();
        FileOutputStream fos = new FileOutputStream("src/main/resources/downloaded_sample.txt");

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0 ){
            fos.write(buffer, 0, length);
        }

        fos.close();
        inputStream.close();
    }
}
