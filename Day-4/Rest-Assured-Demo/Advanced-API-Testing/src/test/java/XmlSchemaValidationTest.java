import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;

public class XmlSchemaValidationTest {
    @Test
    public void validateNoteSchema(){
        given()
                .when()
                .get("https://www.w3schools.com/xml/note.xml")
                .then()
                .statusCode(200)
                .assertThat()
                .body(matchesXsdInClasspath("note.xsd"));
    }
}
