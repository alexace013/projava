package entities.user;

import static java.lang.String.format;

import exceptions.IncorrectUserAgeException;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class User {

    public enum UserData {

        DEFAULT_NAME("Default Name"),
        DEFAULT_AGE(0),
        TEST_USER_NAME("Test Name");

        private String name;
        private short age;

        UserData(final int age) {
            this.age = (short) age;
        }

        UserData(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public short getAge() {
            return age;
        }
    }

    private String name;
    private short age;
    public static short testUserAge;

    public User() {
        name = UserData.DEFAULT_NAME.getName();
        age = UserData.DEFAULT_AGE.getAge();
    }

    /**
     * @param name User name
     */
    public User(final String name) {
        this.name = name;
        age = getRandomAge();
    }

    /**
     * @param name User name
     * @param age  User age
     */
    public User(final String name, final short age) throws IncorrectUserAgeException {
        if (age < 0) {
            throw new IncorrectUserAgeException("User age can't be < 0");
        }
        log.debug(format("User name is '%s'", name));
        this.name = name;

        log.debug(format("User age is '%d'", age));
        this.age = age;
    }

    public static User getTestDefaultUser() {
        return new User();
    }

    public static User getTestUser() {
        return new User(UserData.TEST_USER_NAME.getName());
    }

    private static short getRandomAge() {
        testUserAge = Short.parseShort(String.valueOf((int) (Math.random() * 50)));
        return testUserAge;
    }
}