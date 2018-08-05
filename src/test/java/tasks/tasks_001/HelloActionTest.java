package tasks.tasks_001;

import static entities.user.User.DEFAULT_NAME;
import static entities.user.UserTest.getTestUser;

import org.junit.Assert;
import org.junit.Test;
import tasks.tasks_001.hello.HelloAction;

public class HelloActionTest {

    @Test
    public void _01_testHelloActionPositive() {
        Assert.assertTrue(HelloAction.getSaluteUserText(
                getTestUser())
                .contains(DEFAULT_NAME));
    }
}
