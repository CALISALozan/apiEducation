package Tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_GetRequest_ResponseBilgilerininManuelOlarakTestEdilmesi {
   @Test
    public void test01(){
        /*
    https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
    status code’unun 200,
    ve content type’inin application/json; charset=utf-8,
    ve Server isimli Header’in degerinin Cowboy,
    ve status Line’in HTTP/1.1 200 OK
    ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
    */
    // 1- gerekli body ve end-point hazirla
       String url="https://restful-booker.herokuapp.com/booking/10";
       // 2- expected body oluştur.
       //soruda donen responsenin body sinin soyle oldugunu test edin demiyorsa expected body olusturulmaz
    // 3- request gonder ve donen response i kaydet
       Response response=given().when().get(url);
       response.prettyPrint();
       System.out.println("response.getStatusCode() :  " + response.getStatusCode()+
                           "\ncontent type: "            + response.getContentType()+
                           "\nserver header degeri:  "   + response.getHeader("Server")+
                           "\nstatusLine: "              + response.getStatusLine() +
                          "\nresponse suresi: "          + response.getTime()+" ms");

   }


}
