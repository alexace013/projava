package tasks.glava01.optionA.task004.logic;

import lombok.extern.log4j.Log4j;

import java.util.Scanner;

/*
* Создать приложение для ввода пароля из командной строки
* и сравнения его со строкой-образцом
* */
@Log4j
public class LogicActions {

    public static final String SAVE_PASSWORD = "pass123";

    public static String inputPassword(int password) {
        int adminPassword = 1111;
        Scanner scanner = new Scanner(System.in);
        String result = "WELCOME TO PRIVATE ACCOUNT!!!";

        while (password != adminPassword) {
            System.out.println("- - - - -");
            System.out.println("INVALID PASSWORD!");
            System.out.println("- - - - -\n");
            System.out.print("Input your saved password: ");
            password = scanner.nextInt();
        }
        return result;
    }

    public static boolean isPasswordEqualsApp(final String password) {
        final String message1 = "[PASSWORD WAS SAVED.]";
        final String message2 = "ENTER PASSWORD: ";
        log.debug(message1);
        System.out.println(String.format("%s\n%s", message1, message2));
        if (password.equals(SAVE_PASSWORD)) {
            final String message3 = "PASSWORD IS CORRECT";
            System.out.println(message3);
            log.debug(message3);
            return true;
        } else {
            final String message4 = "!!! PASSWORD iS WRONG !!!";
            log.warn(message4);
            System.out.println(message4);
            return false;
        }
    }
}