package Tests;

import baseUrl.BaseUrlHerokuapp;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C19_BaseUrlHerokuapp extends BaseUrlHerokuapp {
    @Test
    public void test01(){
        /*
        Class icinde 2 Test metodu olusturun ve asagidaki testleri yapin
1- https://restful-booker.herokuapp.com/booking endpointine bir GET request gonderdigimizde
donen response’un status code’unun 200 oldugunu ve Response’ta 12 booking oldugunu test
edin

         */
        // 1- endpoint ve requestbody olustur
        specHerokuapp.pathParam("pp1", "booking");
        // 2- expected data olustur

        // 3- request gonder ve donen response i kaydet
        Response response= given()
                        .when().spec(specHerokuapp)
                        .get("/{pp1}");
        //response.prettyPrint();
        // 4- Assertion
        JsonPath responseJsonpath=response.jsonPath();
        System.out.println(responseJsonpath.getList("bookingid").size());
        response.then().assertThat()
                .statusCode(200)
                .body("bookingid", Matchers.notNullValue());

    }
}
