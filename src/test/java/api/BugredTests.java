package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import entities.user.Bugred;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static services.BugredService.createBugredEntity;

public class BugredTests {
    private static final String HOST = "https://api.github.com";
    private static final String USERS_ENDPOINT = "/users";
    private static final String NONEXISTENT_ENDPOINT = "/sokiable";
    private static final String yanb8_USER = "/yanb8";
    private static final String URL = "http://restcountries.eu/rest/v1/";

    /**
     * Test method sends GET request and check status code
     * Request to: HOST + USERS_ENDPOINT + yanb8_USER
     * Expected status code: 200
     * */
    @Test
    public void getUser() {
        String url = HOST + USERS_ENDPOINT + yanb8_USER;
        
        given()
        .when()
            .get(url)
        .then()
            .statusCode(200)
                .log()
                .all()
                .extract()
                .asString();
    }

    @Test
    public void get404() {
        given()
        .when()
            .get(HOST + USERS_ENDPOINT + yanb8_USER + NONEXISTENT_ENDPOINT)
        .then()
            .statusCode(404)
            .body("message", equalTo("Not Found"))
            .body("documentation_url", equalTo("https://developer.github.com/v3"))
                .log()
                .all()
                .extract()
                .asString();;
    }


    @Test
    public void test3() {
        String url = HOST + USERS_ENDPOINT + yanb8_USER + NONEXISTENT_ENDPOINT;

        given()
        .when()
            .get(url)
        .then()
            .statusCode(404)
            .body("message", equalTo("Not Found"))
            .body("documentation_url", equalTo("https://developer.github.com/v3"))
                .log()
                .all()
                .extract()
                .asString();;
    }

    /**
     * Test method checks Ukrainian object
     * */
    @Test
    public void test4() {
        given()
        .when().get(URL)
        .then()
                .body("name", hasItem("Ukraine"))
                .body("alpha2Code", hasItem("UA"))
                .body("capital", hasItem("Kiev"))
                .body("translations.de", hasItem("Ukraine"))
                .body("translations.es", hasItem("Ucrania"))
                .body("translations.ja", hasItem("ウクライナ"))
                .body("find {it.name == 'Ukraine'}.languages", containsInAnyOrder("uk"))
//                .body("topLevelDomain", hasItemInArray(equalTo(".ua")))
//                .body("callingCodes", hasItem("380"))
                .log().all().extract().asString();
    }

    /**
     * Test method generate data,
     * create Bugred object
     * do POST request
     * check response from server
     * */
    @Test
    public void test5() throws JsonProcessingException {
        Faker f = new Faker();
        Bugred bugred = new Bugred(f.name().firstName(), f.name().username().toLowerCase() + "@jerusalem.il", f.number().digits(10));

        ObjectMapper objectMapper = new ObjectMapper();
//        AnnotationIntrospector annotationIntrospector = new JaxbAnnotationIntrospector(annotationIntrospector); // TODO ---> this string need to check!

//        String objectRequest = objectMapper.writeValueAsString(createBugredEntity()); // option 1
        String objectRequest = objectMapper.writeValueAsString(bugred); // option 2
        System.out.println("OBJECT ---> JSON:\n" + objectRequest + "\n");

        given()
            .body(objectRequest)
        .when()
            .post("http://users.bugred.ru/tasks/rest/doregister")
        .then()
            .body("name", equalTo(bugred.getName()))
            .body("email", equalTo(bugred.getEmail()))
            .statusCode(200)
                .log()
                .all()
                .extract()
                .asString();
    }
}