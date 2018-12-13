package exceptions.examples;

import static exceptions.examples.ExceptionExample.getTextByIndexThrowIndexOutOfBoundsException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

@Log4j
public class ExceptionExampleTest {

    private static final String TEST_TEXT = "test";

    @Test
    public void exceptionExample_test_01() {
        try {
            log.debug("something wrong with array index");
            assertNotEquals(true, exceptionExampleLogic(true).equals(TEST_TEXT));
        } catch (NullPointerException e) {
            log.debug("2-nd exception");
            log.warn(e);
        }
    }

    @Test
    public void exceptionExample_test_02() {
        assertEquals(exceptionExampleLogic(false), TEST_TEXT);
    }

    private String exceptionExampleLogic(final boolean isException) {
        String[] testArray = {TEST_TEXT, "\n", "array", "."};
        String result = null;
        try {
            result = getTextByIndexThrowIndexOutOfBoundsException(testArray, isException);
        } catch (IndexOutOfBoundsException e) {
            log.debug("1-st exception");
            log.warn(e);
        }
        return result;
    }
}