package tasks.task_from_course01;

import java.util.Scanner;

/*
 * Цифры 7
 * Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
 * Пример:
 * 1600061
 * 2
 * */
public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 7-ми значное число: ");
        int number = scanner.nextInt();

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
        System.out.println("Среднее арифметическое: " + arithmeticMean);
    }
}