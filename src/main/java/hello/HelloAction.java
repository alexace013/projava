package hello;

import static java.lang.String.format;

import user.User;

public class HelloAction {

    /**
     * @param user User obj {@link User}
     * @return text with salute a user by name
     */
    public static String getSaluteUserText(final User user) {
        return format("Hello %s.", user.getName());
    }
}