package exceptions.examples;

import lombok.extern.log4j.Log4j;

import java.util.Arrays;

@Log4j
class ExceptionExample {

    static String getTextByIndexThrowIndexOutOfBoundsException(final String[] textArray, final boolean isExceptionThrow) throws IndexOutOfBoundsException {
        return getStringTrowException(textArray, isExceptionThrow);
    }

    private static String getStringTrowException(final String[] array, final boolean isExceptionThrow) {
        final byte incorrectArrayIndex = -1;
        final byte correctArrayIndex = 0;
        log.debug(Arrays.asList(array));
        if (isExceptionThrow) {
            log.warn(String.format("incorrect array index: [%d]", incorrectArrayIndex));
            return array[incorrectArrayIndex];
        }
        log.debug(array[correctArrayIndex]);
        return array[correctArrayIndex];
    }
}