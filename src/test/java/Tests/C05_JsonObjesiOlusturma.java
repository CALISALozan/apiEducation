package Tests;

import org.json.JSONObject;
import org.junit.Test;

public class C05_JsonObjesiOlusturma {
    @Test
    public void test02(){
        /*
        {
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "bookingdates":{
        "checkin":"2018-01-01",
        "checkout":"2019-01-01"
        },
        "totalprice":111,
        "depositpaid":true,
        "lastname":"Brown"
        }
         */
        JSONObject dateJsonObject = new JSONObject();
        dateJsonObject.put("checkin", "2018-01-01");
        dateJsonObject.put("checkout","2019-01-01");

        JSONObject requestbody = new JSONObject();
        requestbody.put("firstname","Jim");
        requestbody.put("additionalneeds", "Breakfast");
        requestbody.put("bookingdates",dateJsonObject);
        requestbody.put("totalprice",111);
        requestbody.put("depositpaid","true");
        requestbody.put("lastname","Brown");
        System.out.println(requestbody);
    }
}
