package bugredTests;

import org.testng.annotations.Test;
import userProject.entity.Bugred;
import userProject.http.HttpClient;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static userProject.utils.JavaFakerGenerator.*;

public class BugredTests extends HttpClient {
    private Bugred bugred;
    private String userName = generateFirstName();
    private String userEmail = userName.toLowerCase() + generateNumber(5) + "@jerusalem.il";
    private String userPassword = userEmail + generateNumber(3);

    @Test(description = "POST /doregister", priority = 1)
    public void registerNewUser() {
        bugred = new Bugred(userName, userEmail, userPassword, null, null, null, null, null);

        bugred = given().body(bugred)
        .when().post("/doregister")
        .then().statusCode(200)
                .body("name", equalTo(bugred.getName()))
                .body("avatar", equalTo("http://users.bugred.ru//tmp/default_avatar.jpg"))
                .body("email", equalTo(bugred.getEmail()))
                    .extract().body().as(bugred.getClass());
    }

    @Test(description = "POST /doregister", priority = 2)
    public void registerWithTheSameUserEmail() {
        given().body(bugred)
        .when().post("/doregister")
        .then().statusCode(200)
                .body("type", equalTo("error"))
                .body("message", equalTo(" email " + bugred.getEmail() + " уже есть в базе"));
    }

    @Test(description = "POST /doregister", priority = 3)
    public void registerWithTheSameUserName() {
        bugred.setEmail(userEmail = userName.toLowerCase() + generateNumber(5) + "@jerusalem.il");

        given().body(bugred)
        .when().post("/doregister")
        .then().statusCode(200)
                .body("type", equalTo("error"))
                .body("message", equalTo(" Текущее ФИО " + bugred.getName() + " уже есть в базе"));
    }

//    @Test
//    public void test4() {
//        given()
//        .when().get(URL)
//        .then()
//                .body("name", hasItem("Ukraine"))
//                .body("alpha2Code", hasItem("UA"))
//                .body("capital", hasItem("Kiev"))
//                .body("translations.de", hasItem("Ukraine"))
//                .body("translations.es", hasItem("Ucrania"))
//                .body("translations.ja", hasItem("ウクライナ"))
//                .body("find {it.name == 'Ukraine'}.languages", containsInAnyOrder("uk"));
////                .body("topLevelDomain", hasItemInArray(equalTo(".ua")))
////                .body("callingCodes", hasItem("380"))
//    }
}