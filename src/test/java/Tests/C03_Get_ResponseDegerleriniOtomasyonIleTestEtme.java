package Tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_Get_ResponseDegerleriniOtomasyonIleTestEtme {
    @Test
    public void test02(){
        /*
       https://restful-booker.herokuapp.com/booking/10 url’ine
       bir GET request
        gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        test ediniz.
         */

        // 1-  end-pont ve request body olustur
        String url = " https://restful-booker.herokuapp.com/booking/10";
        // 2- expected body olustur(yok)
        // 3- request gonderip, donen response yi kaydet
        Response response = given().when().get(url);

        // 4- Asssertion
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "Cowboy")
                .statusLine("HTTP/1.1 200 OK");
    }
}
