package user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public static final String DEFAULT_NAME = "Default Name";
    private String name;

    public User() {
        name = DEFAULT_NAME;
    }

    public User(final String name) {
        this.name = name;
    }
}