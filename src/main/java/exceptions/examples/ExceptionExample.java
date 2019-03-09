package exceptions.examples;

import lombok.extern.log4j.Log4j;

import java.util.Arrays;

@Log4j
class ExceptionExample {

    static String getTextByIndexThrowIndexOutOfBoundsException(final String[] textArray, final boolean isExceptionThrow) throws IndexOutOfBoundsException {
        final byte incorrectArrayIndex = -1;
        final byte correctArrayIndex = 0;
        log.debug(Arrays.toString(textArray));
        if (isExceptionThrow) {
            log.warn(String.format("incorrect array index: [%d]", incorrectArrayIndex));
            return textArray[incorrectArrayIndex];
        }
        log.debug(textArray[correctArrayIndex]);
        return textArray[correctArrayIndex];
    }
}