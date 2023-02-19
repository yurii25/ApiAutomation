import dataEntity.NewGamePayload;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddNewVideoGame {


    @Test
    public void addNewVideoGameTest(){

//        NewGamePayload newGamePayload = new NewGamePayload();
//        newGamePayload.setId(2);
//        newGamePayload.setName("FIFA 2024");
//        newGamePayload.setReleaseDate("2023-07-19T19:12:00.286Z");
//        newGamePayload.setReviewScore(90);
//        newGamePayload.setCategory("Sport");
//        newGamePayload.setRating("Universal");

        given().body("{\n" +
                        "  \"id\": 11,\n" +
                        "  \"name\": \"Far Cry 3\",\n" +
                        "  \"releaseDate\": \"2023-02-19T19:12:00.286Z\",\n" +
                        "  \"reviewScore\": 90,\n" +
                        "  \"category\": \"Shooter\",\n" +
                        "  \"rating\": \"Universal\"\n" +
                        "}")
                .post("http://localhost:8080/app/videogames")
                .then().assertThat().statusCode(HttpStatus.SC_CREATED)
                .log().body();
    }
}
