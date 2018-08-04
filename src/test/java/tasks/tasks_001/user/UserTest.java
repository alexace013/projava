package tasks.tasks_001.user;

import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@Log4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {

    private static User testUser = new User();

    @Test
    public void _01_testDefaultUserName() {
        Assert.assertEquals(testUser.DEFAULT_NAME, testUser.getName());
    }

    @Test
    public void _02_testSetUserName() {
        final String testName = "Test Name";
        testUser.setName(testName);
        Assert.assertEquals(testName, testUser.getName());
    }

    @Test
    public void _03_testNullUserName() {
        testUser.setName(null);
        Assert.assertNull(testUser.getName());
    }

    @Test
    public void _04_testObjectUser() {
        try {
            testUser = (User) new Object();
        } catch (ClassCastException e) {
            log.error(e);
            String errorMessage = "java.lang.Object cannot be cast to tasks.tasks_001.user.User";
            log.debug(errorMessage);
            Assert.assertEquals(errorMessage, e.getMessage());
        }
    }
}