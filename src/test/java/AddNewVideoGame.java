import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataEntity.NewGamePayload;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddNewVideoGame {


    @Test
    public void addNewVideoGameTest() {

        NewGamePayload newGamePayload = new NewGamePayload();
        newGamePayload.setId(2);
        newGamePayload.setName("FIFA 2024");
        newGamePayload.setReleaseDate("2023-07-19T19:12:00.286Z");
        newGamePayload.setReviewScore(90);
        newGamePayload.setCategory("Sport");
        newGamePayload.setRating("Universal");

//        ObjectMapper objectMapper = new ObjectMapper();
//        String newGame = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newGamePayload);

        given().body(newGamePayload)
                .post("http://localhost:8080/app/videogames")
                .then().assertThat().statusCode(201)                       //  HttpStatus.SC_CREATED
                .log().body();
    }

    // The HTTP 415 Unsupported Media Type
    // client error response code indicates that the server refuses to accept the request because
    // the payload format is in an unsupported format.
}
