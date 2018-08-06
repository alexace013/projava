package entities.user;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import static java.lang.String.format;

@Getter
@Setter
@Log4j
public class User {
    public static final String DEFAULT_NAME = "Default Name";
    private String name;

    public User() {
        name = DEFAULT_NAME;
    }

    /**
     * @param name User name
     */
    public User(final String name) {
        log.debug(format("User name is '%s'", name));
        this.name = name;
    }
}