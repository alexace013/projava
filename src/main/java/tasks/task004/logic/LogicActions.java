package tasks.task004.logic;

import java.util.Scanner;

/*
* Создать приложение для ввода пароля из командной строки
* и сравнения его со строкой-образцом
* */
public class LogicActions {
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
}