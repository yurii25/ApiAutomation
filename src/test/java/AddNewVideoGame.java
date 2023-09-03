import Controllers.SuitesControllers;
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
        newGamePayload.setReleaseDate("2023-09-03T15:22:11.081Z");
        newGamePayload.setReviewScore(90);
        newGamePayload.setCategory("Sport");
        newGamePayload.setRating("Universal");


        given().body(newGamePayload)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .post("http://localhost:8080/app/videogames")
                .then()
                .assertThat().statusCode(201)                       //  HttpStatus.SC_CREATED
                .log().body();
    }

}
