package tasks.task_001;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.String.format;
import static entities.user.User.UserData.DEFAULT_NAME;
import static entities.user.User.getTestDefaultUser;
import static tasks.task_001.hello.HelloAction.getSaluteUserText;

import org.junit.Test;

public class HelloActionTest {

    @Test
    public void _01_testHelloActionPositive() {
        assertTrue(getSaluteUserText(getTestDefaultUser())
                .contains(DEFAULT_NAME.getName()));
    }

    @Test
    public void _02_testHelloActionNegative() {
        assertFalse(getSaluteUserText(getTestDefaultUser())
                .contains(format("%s-TEST", DEFAULT_NAME.getName())));
        System.out.println();
    }
}