package Tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C09_Get_BodyTekrarlardanKurtulma {
    @Test
    public void test01(){
        /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde
        donen Response’un,
        status code’unun 200,
        ve content type’inin application-json,
        ve response body’sindeki
        "firstname“in, "Susan",
        ve "lastname“in, "Jackson",
        ve "totalprice“in, 612 den kucuk oldugu,
        ve "depositpaid“in, false,
        ve "additionalneeds“in, "Breakfast" bos olmadıgını
        oldugunu test edin
         */
        // 1- endpoint ve request body hazırla
        String url = "https://restful-booker.herokuapp.com/booking/10";
        // 2- expected data olustur
        // 3- request gonderip donen response i kaydet
        Response response = given().when().get(url);
        response.prettyPrint();
        // 4- Assertion
       /*
        response.then().assertThat().statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname", Matchers.equalTo("Jim"))
                .body("lastname", Matchers.equalTo("Jackson"))
                .body("totalprice", Matchers.lessThan(1000))
                .body("depositpaid", Matchers.equalTo(false))
                .body("additionalneeds", Matchers.notNullValue());

        */
              response.then().assertThat().statusCode(200)
                      .contentType(ContentType.JSON)
                      .body("firstname", equalTo("Eric"),
                              "lastname", equalTo("Brown"),
                             "totalprice", lessThan(1000),
                              "depositpaid", equalTo(true),
                              "additionalneeds", notNullValue());

    }
}
