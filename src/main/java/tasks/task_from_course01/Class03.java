package tasks.task_from_course01;

import java.util.Scanner;

/*
 * Больший меньший
 * Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку
 * Пример:
 * 5
 * 2
 * 7
 * 7 2
 * */
public class Class03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int b = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int c = scanner.nextInt();

        /*
         * First number
         * */
        if (a > b & a > c) {
            System.out.print(a + " ");
        }
        if (a < b & a < c) {
            System.out.print(a + " ");
        }

        /*
         * Second number
         * */
        if (b > a & b > c) {
            System.out.print(b + " ");
        }
        if (b < a & b < c) {
            System.out.print(b + " ");
        }

        /*
         * Third number
         * */
        if (c > a & c > b) {
            System.out.print(c + " ");
        }
        if (c < a & c < b) {
            System.out.print(c + " ");
        }

    }
}