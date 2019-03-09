package api;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GitHubAPI {
    String host = "https://api.github.com";
    String usersEndpoint = "/users";
    String yanb8User = "/yanb8";
    String error = "/1q2w3e";

    @Test
    public void getUser() {
        given()
        .when()
            .get(host + usersEndpoint + yanb8User)
        .then()
            .statusCode(200);
    }

    @Test
    public void get404() {
        given()
        .when()
            .get(host + usersEndpoint + yanb8User + error)
        .then()
            .statusCode(404)
            .and()
            .body("message", equalTo("Not Found"))
            .and()
            .body("documentation_url", equalTo("https://developer.github.com/v3"));
    }
}