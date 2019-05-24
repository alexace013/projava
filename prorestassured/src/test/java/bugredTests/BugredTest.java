package bugredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static userProject.utils.JavaFakerGenerator.*;
import static userProject.utils.random.RandomDateUtil.getRandomDate;
import static userProject.utils.random.RandomGenderUtil.getGender;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import userProject.entity.Bugred;
import userProject.http.HttpClient;

import java.time.LocalDate;

public class BugredTest extends HttpClient {

    private Bugred bugred;
    private String userName = generateFirstName();
    private String userSurname = generateSecondName();
    private String userEmail = userName.toLowerCase() + generateNumber(5) + "@projava.github.com";
    private String userPassword = userEmail + generateNumber(3);

    @Test(description = "POST /doregister", priority = 1)
    public void registerNewUser() {
        bugred = new Bugred(userName,
                userSurname,
                userEmail,
                userPassword,
                null,
                getRandomDate(),
                getGender(true),
                new Faker().name().title(),
                getRandomDate(2015, LocalDate.now().getYear()));

        bugred = given().body(bugred)
                .when().post("/doregister")
                .then().statusCode(200)
                .body("name", equalTo(bugred.getName()))
                .body("surname", equalTo(bugred.getSurname()))
                .body("avatar", equalTo("http://users.bugred.ru/tmp/default_avatar.jpg"))
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

    // TODO need to do test4 or remove from a class
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