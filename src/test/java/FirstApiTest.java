
import dataEntity.ZipResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;


public class FirstApiTest {

    @Test
    public void firstTest(){
        Response response = given().when().get("http://api.zippopotam.us/us/90210");      //.then().log().body();

        ZipResponse zipResponse = response.as(ZipResponse.class);
        String place = zipResponse.getPlaces().get(0).getPlaceName();
        System.out.println(place);
    }
}
