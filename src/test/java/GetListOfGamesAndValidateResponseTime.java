
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;


public class GetListOfGamesAndValidateResponseTime {


    @Test
    public void getListOfGamesAndValidateResponseTimeTest(){

        long expectedResponseTime = 500L;

        Response response = given().when().get("http://localhost:8080/app/videogames");

        response.then().time(lessThan(expectedResponseTime)).and();

        response.then().log().all();


//        List <GamesListItem> gamesListItem = Arrays.asList(response.as(GamesListItem.class));
//        int name = gamesListItem.get(2).getReviewScore();
//        System.out.println(name);

    }
}
