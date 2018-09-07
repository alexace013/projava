package tasks.task003.logic;

import java.util.Scanner;

public class LogicActions {
    /*
    * Создать приложение, выводящее N строк с переходом и без перехода на новую строку
    * */
    public static int withNewLine(int with) {
        Scanner scanner = new Scanner(System.in);
        int countOfNewLines = 0;
        int result = 0;
        int a = 0;

        if (with == -1) {
            System.out.print("Input number of string with new lines: ");
            a = scanner.nextInt();
        } else {
            a = with;
        }

        if (a >= 1) {
            for (int i = 0; i < a; i++) {
                System.out.println((int) (Math.random() * 100));
                countOfNewLines++;
            }
        }

        result = countOfNewLines;
        System.out.print("Total lines: " + result + "\n");
        return result;
    }

    public static int withoutNewLine(int without) {
        Scanner scanner = new Scanner(System.in);
        int countOfNewLines = 0;
        int result = 0;
        int a = 0;

        if (without == -1) {
            System.out.print("Input number of string without new lines: ");
            a = scanner.nextInt();
        } else {
            a = without;
        }

        if (a >= 1) {
            for (int i = 0; i < a; i++) {
                System.out.print((int) (Math.random() * 100));
                countOfNewLines++;
            }
        }

        result = countOfNewLines;
        System.out.print("\nTotal strings: " + result + "\n");
        return result;
    }
}