package entities.user;

import static java.lang.String.format;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class User {
    public static final String DEFAULT_NAME = "Default Name";
    private static final short DEFAULT_VALUE = 0;
    private String name;
    private short age;

    public User() {
        name = DEFAULT_NAME;
        age = DEFAULT_VALUE;
    }

    /**
     * @param name User name
     * @param age User age
     */
    public User(final String name, short age) {
        log.debug(format("User name is '%s'", name));
        this.name = name;

        log.debug(format("User age is '%d'", age));
        this.age = age;
    }

    public static User getTestUser() {
        return new User();
    }
}