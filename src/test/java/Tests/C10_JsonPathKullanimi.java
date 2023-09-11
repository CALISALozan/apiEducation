package Tests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C10_JsonPathKullanimi {
    @Test
    public void method1(){
        JSONObject kisiBilgileriJsonObj =new JSONObject();
        JSONObject adresJsonObj = new JSONObject();
        JSONArray telefonBilgileriArr = new JSONArray();
        JSONObject cepTelJSonObj = new JSONObject();
        JSONObject evTelJSonObj = new JSONObject();
       adresJsonObj.put("streetAddress", "naist street");
       adresJsonObj.put("city", "Nara");
       adresJsonObj.put("postalcode", "630-0192");
       cepTelJSonObj.put("type", "iPhone");
       cepTelJSonObj.put("number", "0123-4567-8888");
       evTelJSonObj.put("type", "home");
       evTelJSonObj.put("number", "0123-4567-8910");
       telefonBilgileriArr.put(cepTelJSonObj);
       telefonBilgileriArr.put(evTelJSonObj);
       kisiBilgileriJsonObj.put("firstName", "John");
       kisiBilgileriJsonObj.put("lastName", "Doe");
       kisiBilgileriJsonObj.put("age", 26);
       kisiBilgileriJsonObj.put("adress", adresJsonObj);
       kisiBilgileriJsonObj.put("phoneNumbers", telefonBilgileriArr);
        System.out.println("kisiBilgileriJsonObj = " + kisiBilgileriJsonObj);
        System.out.println("kisiBilgileriJsonObj = " + kisiBilgileriJsonObj.get("firstName"));
        System.out.println("kisiBilgileriJsonObj = " + kisiBilgileriJsonObj.getJSONObject("adress").get("streetAddress"));



    }
}
