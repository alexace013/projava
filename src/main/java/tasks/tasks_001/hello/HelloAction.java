package tasks.tasks_001.hello;

import static java.lang.String.format;

import entities.user.User;

public class HelloAction {

    /**
     * @param user User obj {@link User}
     * @return text with salute a user by name
     */
    public static String getSaluteUserText(final User user) {
        return format("Hello %s.", user.getName());
    }
}