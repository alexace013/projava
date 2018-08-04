package tasks.tasks_001.hello;

import static java.lang.String.format;

import tasks.tasks_001.user.User;

public class HelloAction {

    /**
     * @param user User obj {@link User}
     * @return text with salute a tasks.tasks_001.user by name
     */
    public static String getSaluteUserText(final User user) {
        return format("Hello %s.", user.getName());
    }
}