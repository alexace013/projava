package userProject.http;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

public class HttpClient {
    public HttpClient() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .addParam(String.valueOf(new ResponseLoggingFilter()))
                .build();

//        RestAssured.responseSpecification = new ResponseSpecBuilder()
//                .build();
    }
}