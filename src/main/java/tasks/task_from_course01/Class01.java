package tasks.task_from_course01;

import java.util.Scanner;

/*
 * Дано 2х значное число, вычислить разность между цифрами этого числа
 * Пример:
 * 50 = 5 - 0 = 5
 * 49 = 9 - 4 = 5
 * 19 =
 * */
public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число от '10' до '99' включительно: ");

        int diff = scanner.nextInt();
        if (diff <= 9 || diff >= 100) {
            System.out.println("Число недопустимо, сказано же, от '10' до '99' включительно!");
        } else {
            int firstDigit = diff / 10;
            int secondDigit = diff % 10;
            if (firstDigit >= secondDigit) {
                int result = firstDigit - secondDigit;
                System.out.println("Разность между цифрами этого числа равна: " + result);
            } else if (firstDigit < secondDigit) {
                int result = secondDigit - firstDigit;
                System.out.println("Разность между цифрами этого числа равна: " + result);
            }
        }
    }
}