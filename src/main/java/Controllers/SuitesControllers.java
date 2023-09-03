package Controllers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class SuitesControllers {


    private RequestSpecification getGame() {
        return RestAssured
                .given()
                .baseUri("http://localhost:8080/app/videogames")
                .header("Accept", "application/json");
    }




    public Response addGame() {
        return RestAssured.given().
                header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .post("http://localhost:8080/app/videogames");
    }
}
