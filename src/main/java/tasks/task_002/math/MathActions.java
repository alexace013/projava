package tasks.task_002.math;

import static java.lang.System.out;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
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
            String differenceMessage = "The difference between the digits of this number is: %d\n- - - - -THE END\n";
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

        String messageText = "The largest of the three {%d, %d, %d} is %d\n- - - - -THE END\n";
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

    public static String getSmallestAndBiggestOfInputtedNumbers(final BufferedReader reader) {
        int a = 0;
        int b = 0;
        int c = 0;
        String result = "";
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
        } catch (NumberFormatException nfe) {
            System.out.println("EXCEPTION - INCORRECT VALUE, LETTERS ARE NOT ALLOWED\n" + nfe + "\n");
            nfe.printStackTrace();
        }

        // first number
        if (a > b & a > c) {
            System.out.print(result = a + " ");
        }
        if (a < b & a < c) {
            System.out.print(result = a + " ");
        }

        // second number
        if (b > a & b > c) {
            System.out.print(result = b + " ");
        }
        if (b < a & b < c) {
            System.out.print(result = b + " ");
        }

        // third number
        if (c > a & c > b) {
            System.out.print(result = c + " ");
        }
        if (c < a & c < b) {
            System.out.print(result = c + " ");
        }
        return "\n- - - - -THE END\n";
    }

    public static String getDirectAverageOfDigits(final BufferedReader reader) {
        int number = 0;
        try {
            log.debug("Введите 7-ми значное число: ");
            number = Integer.parseInt(reader.readLine());
        } catch (IOException ioe) {
            System.out.println("EXCEPTION - " + ioe);
            ioe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("EXCEPTION - INCORRECT VALUE, LETTERS ARE NOT ALLOWED\n" + nfe + "\n");
            nfe.printStackTrace();
        }

        int res1 = number / 1000000; // 1
        int res2 = number / 100000; // 12
        res2 = res2 % 10; // 2
        int res3 = number / 10000; // 123
        res3 = res3 % 10; // 3
        int res4 = number / 1000; // 1234
        res4 = res4 % 10; // 4
        int res5 = number / 100; // 12345
        res5 = res5 % 10; // 5
        int res6 = number / 10; // 123456
        res6 = res6 % 10; // 6
        int res7 = number / 1; // 1234567
        res7 = res7 % 10; // 7

        int arithmeticMean = (res1 + res2 + res3 + res4 + res5 + res6 + res7) / 7;
        String result = "Среднее арифметическое: " + arithmeticMean + "\nTHE END\n";
        return result;
    }

    public static String getQuarterOfRectangularCoordinateSystem(final BufferedReader reader) {
        byte x = 0;
        byte y = 0;
        try {
            log.debug("Введите координаты (от -10 до 10 (включительно)) для оси 'x': ");
            x = Byte.parseByte(reader.readLine());

            log.debug("Введите координаты (от -10 до 10 (включительно)) для оси 'y': ");
            y = Byte.parseByte(reader.readLine());
        } catch (IOException ioe) {
            System.out.println("EXCEPTION - " + ioe);
            ioe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("EXCEPTION - INCORRECT VALUE, LETTERS ARE NOT ALLOWED\n" + nfe + "\n");
            nfe.printStackTrace();
        }

        log.debug("- - - - -");
        if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
            System.out.println("Координаты расположены в первой четверти (в правом верхнем углу)");
        } else if ((x < 0 & x > -11) & (y > 0 & y < 11)) {
            System.out.println("Координаты расположены во второй четверти (в левом верхнем углу)");
        } else if ((x < 0 & x > -11) & (y < 0 & y > -11)) {
            System.out.println("Координаты расположены в третей четверти (в левом нижнем углу)");
        } else if ((x > 0 & x < 11) & (y < 0 & y > -11)) {
            System.out.println("Координаты расположены в четвертой четверти (в правом нижнем углу)");
        } else if (x == 0 & y == 0) {
            System.out.println("Координатов нет!");
        } else {
            System.out.println("Быдыыыщь!");
        }

        log.debug("- - - - -");
        String result = "Ваши координаты:\nx = " + x + "\n" + "y = " + y + "\nTHE END\n";
        return result;
    }
}