import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class XmlParsingTest {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI = "https://www.w3schools.com/xml";
    }

    @Test
    public void parseNoteXml(){
        Response response = given().get("/note.xml");

        // print response as string
        System.out.println("Response: "+ response.asString());

        // Parse XML using XmlPath
        XmlPath xmlPath = new XmlPath(response.asString());

        // Extract individual elements
        String to = xmlPath.getString("note.to");
        String from = xmlPath.getString("note.from");
        String heading = xmlPath.getString("note.heading");
        String body = xmlPath.getString("note.body");

        System.out.println("To: "+ to);
        System.out.println("From: "+ from);
        System.out.println("Heading: "+ heading);
        System.out.println("Body: "+ body);

        // Assertions
        response.then().statusCode(200).body("note.to", equalTo("Tove"));
    }
}
