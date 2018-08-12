package entities.user;

import static entities.user.User.UserData.DEFAULT_NAME;
import static entities.user.User.UserData.DEFAULT_AGE;
import static entities.user.User.UserData.TEST_NAME;
import static java.lang.String.format;

import com.github.javafaker.Faker;
import exceptions.IncorrectUserAgeException;
import lombok.extern.log4j.Log4j;
import org.junit.*;
import org.junit.runners.MethodSorters;

@Log4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {

    private User user;
    private Faker faker = new Faker();

    @Test
    public void _01_testDefaultUser() {
        user = new User();
        Assert.assertNotNull(user);
        Assert.assertEquals(DEFAULT_NAME.getName(), user.getName());
        Assert.assertEquals(DEFAULT_AGE.getAge(), user.getAge());
    }

    @Test
    public void _02_testTestUser() {
        user = User.getTestUser();
        Assert.assertEquals(TEST_NAME.getName(), user.getName());
        Assert.assertEquals(User.testUserAge, user.getAge());
    }

    @Test
    public void _03_testUserWithCorrectData() throws IncorrectUserAgeException {
        user = User.getFakerUser();
        Assert.assertNotNull(user.getName());
        checkBoundaryValues(user);
    }

    @Test
    public void _04_testUserWithNegativeAgeData() {
        int age = (-1) * (faker.random().nextInt(User.getRandomMinValue(), User.getRandomMaxValue()));
        try {
            user = new User(faker.name().firstName(), age);
        } catch (IncorrectUserAgeException e) {
            log.error(format("User age[%d] is less than ZER[0]", age));
        }
    }

    @Test
    public void _05_testUserNullData() {
        user = null;
        Assert.assertNull(user);
    }

    @Test
    public void _06_testUserNameNullData() throws IncorrectUserAgeException {
        try {
            user = new User(null, faker.random()
                    .nextInt(User.getRandomMinValue(), User.getRandomMaxValue()));
            Assert.assertNull(user.getName());
            checkBoundaryValues(user);
        } catch (NullPointerException e) {
            log.error(e.getMessage());
        }
    }

    private void checkBoundaryValues(final User user) {
        Assert.assertTrue(user.getAge()
                >= User.getRandomMinValue() && user.getAge()
                <= User.getRandomMaxValue());
    }
}