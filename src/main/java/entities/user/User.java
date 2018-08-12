package entities.user;

import static java.lang.String.format;

import com.github.javafaker.Faker;
import exceptions.IncorrectUserAgeException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class User {

    @Getter
    public enum UserData {

        DEFAULT_NAME("Default Name"),
        TEST_NAME("Test Name"),
        DEFAULT_AGE(0);

        private String name;
        private int age;

        UserData(final int age) {
            this.age = age;
        }

        UserData(final String name) {
            this.name = name;
        }
    }

    private String name;
    private int age;
    public static int testUserAge;
    private static final String USER_DEBUG_MESSAGE = "{\n\tuser name: %s\n\tuser age: %d\n}";

    public User() {
        name = UserData.DEFAULT_NAME.getName();
        age = UserData.DEFAULT_AGE.getAge();
        log.debug(format(USER_DEBUG_MESSAGE, name, age));
    }

    /**
     * @param name User name
     */
    public User(final String name) {
        this.name = name;
        age = new Faker().random().nextInt(0, 150);
        testUserAge = age;
        log.debug(format(USER_DEBUG_MESSAGE, name, age));
    }

    /**
     * @param name User name
     * @param age  User age
     */
    public User(final String name, final int age) throws IncorrectUserAgeException, NullPointerException {
        if (age < 0) {
            throw new IncorrectUserAgeException("User age can't be negative");
        }
        if (name == null) {
            throw new NullPointerException("User name is NULL");
        }
        this.name = name;
        this.age = age;
        log.debug(format(USER_DEBUG_MESSAGE, name, age));
    }

    public static User getTestDefaultUser() {
        return new User();
    }

    public static User getTestUser() {
        return new User(UserData.TEST_NAME.getName());
    }

    public static User getFakerUser() throws IncorrectUserAgeException {
        Faker faker = new Faker();
        return new User(faker.name().firstName(), faker.random().nextInt(0, 150));
    }
}