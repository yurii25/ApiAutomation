
import dataEntity.GamesListItem;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;


public class GetListOfGamesAndValidateResponseTime {


    @Test
    public void getListOfGamesAndValidateResponseTimeTest(){

        long expectedResponseTime = 500L;

        Response response = given().when().get("http://localhost:8080/app/videogames");

        response.then().time(lessThan(expectedResponseTime)).and();

        response.then().log().all();


//        List<GamesListItem> gamesListItem = Arrays.asList(response.as(GamesListItem.class));
//        int name = gamesListItem.get(2).getReviewScore();
//        System.out.println(name);

        // тут чомусь 1 позиція в gamesListItem списку, тому не можу вивести, наприклад getReviewScore()
        // для 2ї позиції
        // але сам тест працює

    }
}
