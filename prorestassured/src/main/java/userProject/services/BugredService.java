package userProject.services;

import com.github.javafaker.Faker;
import userProject.entity.Bugred;

public class BugredService {
    public static Object createBugredEntity() {
        Faker faker = new Faker();
        Bugred bugred = new Bugred(faker.name().firstName(), faker.name().username().toLowerCase() + "@jerusalem.il", faker.number().digits(10));
        System.out.println("OBJECT CREATED:\n" + bugred + "\n");
        return bugred;
    }

    public static Object createBugredEntity(Object object) {
        return object;
    }
}