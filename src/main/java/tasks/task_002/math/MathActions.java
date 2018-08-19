package tasks.task_002.math;

import static java.lang.System.out;

import lombok.extern.log4j.Log4j;
import java.io.BufferedReader;
import java.io.IOException;

@Log4j
public class MathActions {
    private static final String EXCEPTION_MESSAGE = "VALUE {%s} IS NOT A NUMBER!!!";

    public static String task1(final BufferedReader reader) {
        /*
         * Дано 2х значное число, вычислить разность между цифрами этого числа
         * Пример:
         * 50 = 5 - 0 = 5
         * 49 = 9 - 4 = 5
         * 19 =
         * */
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

    public static String task2(final BufferedReader reader) {
        /*
         * Пользователь вводит 3 числа, вывести на экран большее из них
         * */
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

    public static String task3(final BufferedReader reader, int one, int two, int three) {
        /*
         * Больший меньший
         * Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку
         * Пример:
         * 5
         * 2
         * 7
         * 7 2
         * */
        int a = one;
        int b = two;
        int c = three;
        String result = "";
        if (reader != null) {
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
        } else {
            a = one;
            b = two;
            c = three;
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

    public static String task4(final BufferedReader reader) {
        /*
         * Цифры 7
         * Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
         * Пример:
         * 1600061
         * 2
         * */
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
        String result = "Среднее арифметическое: " + arithmeticMean + "\n- - - - -THE END\n";
        return result;
    }

    public static String task5(final BufferedReader reader) {
        /*
         * Четверть
         * Пользователь вводит координаты точки,
         * определить в какой она находится четверти (декартова система координат),
         * углы наз. - координатными углами, четвертями или квадрантами плоскости.
         * Если точка находится между четвертями, то выводить 0
         * Пример:
         * -2 2
         * 2
         * */
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
        String result = "Ваши координаты:\nx = " + x + "\n" + "y = " + y + "\n- - - - -THE END\n";
        return result;
    }
}