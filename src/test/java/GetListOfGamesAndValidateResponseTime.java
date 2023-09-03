
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetListOfGamesAndValidateResponseTime {


    @Test
    public void getListOfGamesAndValidateResponseTimeTest(){

        long expectedResponseTime = 1000L;

        given()
                .header("Accept", "application/json")
                .when()
                .get("http://localhost:8080/app/videogames")
                .then()
                .time(lessThan(expectedResponseTime))
                .and()
                .log().all();

    }

    @Test
    public void Test(){

        long expectedResponseTime = 1000L;

        given()
                .get(baseURI)
                .then()
                .time(lessThan(expectedResponseTime))
                .and()
                .log().all();

    }

    // виводить HTML
}
