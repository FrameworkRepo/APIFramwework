package Resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

    RequestSpecification reqSpec;
    ResponseSpecification resSpec;
    public  RequestSpecification requestSpecification(){

        reqSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("key","qaclick123")
                .setContentType(ContentType.JSON).build();

        return reqSpec;
    } public  ResponseSpecification responseSpecification(){

        resSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON)
                .expectStatusCode(200).build();

        return resSpec;
    }
}
