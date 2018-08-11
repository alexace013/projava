package entities.user;

import static entities.user.User.UserData.DEFAULT_NAME;
import static entities.user.User.UserData.DEFAULT_AGE;
import static entities.user.User.UserData.TEST_USER_NAME;

import lombok.extern.log4j.Log4j;
import org.junit.*;
import org.junit.runners.MethodSorters;

@Log4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {

    private User testUser;


    @Before
    public void createUser() {
        testUser = new User();
    }

    @Test
    public void _01_testDefaultUser() {
        Assert.assertNotNull(testUser);
        Assert.assertEquals(DEFAULT_NAME.getName(), testUser.getName());
        Assert.assertEquals(DEFAULT_AGE.getAge(), testUser.getAge());
    }

    @Test
    public void _02_testUserWithTestParam() {
        testUser = new User(TEST_USER_NAME.getName());
        Assert.assertEquals(TEST_USER_NAME.getName(), testUser.getName());
        Assert.assertEquals(User.testUserAge, testUser.getAge());
    }

    @Test
    @Ignore
    public void _04_testObjectUser() {
        try {
            testUser = (User) new Object();
        } catch (ClassCastException e) {
            log.error(e);
            String errorMessage = "java.lang.Object cannot be cast to entities.user.User";
            log.debug(errorMessage);
            Assert.assertEquals(errorMessage, e.getMessage());
        }
    }
}