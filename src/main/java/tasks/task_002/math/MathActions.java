package tasks.task_002.math;

import static java.lang.System.out;

import lombok.extern.log4j.Log4j;

import java.io.BufferedReader;
import java.io.IOException;

@Log4j
public class MathActions {
    private static final String EXCEPTION_MESSAGE = "VALUE {%s} IS NOT A NUMBER!!!";

    public static String getDifferenceBetweenDoubleFigureInfo(final BufferedReader reader) {
        byte rangeFrom = 10;
        byte rangeTo = 99;
        String strValue = "";
        String message = String.format("Please, input value from %d to %d: ", rangeFrom, rangeTo);
        log.debug(message);
        out.print(message);
        try {
            strValue = reader.readLine();
        } catch (IOException e) {
            log.error(String.format(EXCEPTION_MESSAGE, strValue));
            e.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("Only double figure, please!" + nfe);
        }

        final int value = Integer.parseInt(strValue);
        if (value < rangeFrom || value > rangeTo) {
            log.warn(String.format("Value should be include range from %d to %d, but was entered {%s}", rangeFrom, rangeTo, strValue));
        } else {
            int firstNumber = value / rangeFrom;
            int secondNumber = value % rangeFrom;
            String differenceMessage = "The difference between the digits of this number is: %d\nTHE END\n";
            String differenceMessageLog = "The difference between the digits of this number is: %d";
            int result;
            if (firstNumber >= secondNumber) {
                result = firstNumber - secondNumber;
                log.debug(String.format(differenceMessageLog, result));
                return String.format(differenceMessage, result);
            } else {
                result = secondNumber - firstNumber;
                log.debug(String.format(differenceMessageLog, result));
                return String.format(differenceMessage, result);
            }
        }
        return "nothing else";
    }

    public static String getTheLargestOfTheThreeNumbers(final BufferedReader reader) {
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        try {
            log.debug("Enter 1-st number: ");
            value1 = Integer.parseInt(reader.readLine());
            log.debug(String.format("value = {%s}\n", value1));
            log.debug("Enter 2-nd number: ");
            value2 = Integer.parseInt(reader.readLine());
            log.debug(String.format("value = {%s}\n", value2));
            log.debug("Enter 3-td number: ");
            value3 = Integer.parseInt(reader.readLine());
            log.debug(String.format("value = {%s}\n", value3));
        } catch (IOException e) {
            log.error(String.format(EXCEPTION_MESSAGE, ""));
        } catch (NumberFormatException nfe) {
            System.out.println("EXCEPTION - INCORRECT VALUE, LETTERS ARE NOT ALLOWED\n" + nfe);
        }

        String messageText = "The largest of the three {%d, %d, %d} is %d";
        int max;
        if (value1 > value2) {
            max = value1;
        } else {
            max = value2;
        }
        if (value3 > max) {
            max = value3;
        }
        return String.format(messageText, value1, value2, value3, max);
    }

    public static void getSmallestAndBiggestOfInputtedNumbers(final BufferedReader reader) {
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            log.debug("Input first number: ");
            a = Integer.parseInt(reader.readLine());
            log.debug("Input second number: ");
            b = Integer.parseInt(reader.readLine());
            log.debug("Input third number: ");
            c = Integer.parseInt(reader.readLine());
        } catch (IOException ioe) {
            System.out.println("EXCEPTION\n" + ioe);
            ioe.printStackTrace();
        }

        // first number
        if (a > b & a > c) {
            System.out.print(a + " ");
        }
        if (a < b & a < c) {
            System.out.print(a + " ");
        }

        // second number
        if (b > a & b > c) {
            System.out.print(b + " ");
        }
        if (b < a & b < c) {
            System.out.print(b + " ");
        }

        // third number
        if (c > a & c > b) {
            System.out.print(c + " ");
        }
        if (c < a & c < b) {
            System.out.print(c + " ");
        }
    }
}