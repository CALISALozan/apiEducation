package Tests;

import baseUrl.BaseUrlHerokuapp;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C22_BaseUrlHerokuappQueryParam2 extends BaseUrlHerokuapp {
    @Test
    public void test01(){
        /*
        2- https://restful-booker.herokuapp.com/booking endpointine gerekli Query parametrelerini
yazarak “firstname” degeri “Susan” ve “lastname” degeri “Ericson” olan rezervasyon
oldugunu test edecek bir GET request gonderdigimizde, donen response’un status
code’unun 200 oldugunu ve “Susan Ericson” ismine sahip en az bir booking oldugunu test
edin
         */
        // 1- endpoint ve requestbody olustur
        specHerokuapp
                .pathParam("pp1", "booking")
                .queryParams("firstname", "Sally", "lastname", "Jackson");
        // 2- expected data olustur

        // 3- request gonder ve donen response i kaydet
        Response response = given()
                .when().spec(specHerokuapp)
                .get("/{pp1}");
        //response.prettyPrint();

        // 4- Assertion
    response.then()
            .assertThat()
            .statusCode(200)
            .body("bookingid", Matchers.notNullValue());

    }
}
