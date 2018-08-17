package tasks.task_from_course01;

import java.util.Scanner;

/*
 * Пользователь вводит 3 числа, вывести на экран большее из них
 * */
public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число от -128 до 127: ");
        byte a = scanner.nextByte();

        System.out.print("Введите второе число от -128 до 127: ");
        byte b = scanner.nextByte();

        System.out.print("Введите третье число от -128 до 127: ");
        byte c = scanner.nextByte();

        if (a >= b & a >= c) {
            System.out.println("Самое большое число из трех: '" + a + "'");
        } else if (b >= a & b >= c) {
            System.out.println("Самое большое число из трех: '" + b + "'");
        } else if (c >= b & c >= a) {
            System.out.println("Самое большое число из трех: '" + c + "'");
        }
    }
}