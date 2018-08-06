package tasks.task_001;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.String.format;
import static entities.user.User.DEFAULT_NAME;
import static entities.user.UserTest.getTestUser;
import static tasks.task_001.hello.HelloAction.getSaluteUserText;

import org.junit.Test;

public class HelloActionTest {

    @Test
    public void _01_testHelloActionPositive() {
        assertTrue(getSaluteUserText(getTestUser()).contains(DEFAULT_NAME));
    }

    @Test
    public void _02_testHelloActionNegative() {
        assertFalse(getSaluteUserText(getTestUser()).contains(format("%s-TEST", DEFAULT_NAME)));
    }
}