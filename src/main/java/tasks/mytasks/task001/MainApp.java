package tasks.mytasks.task001;

import java.util.Scanner;

/*
* Написать приложение, которое позволит сокращать суммы для вашего веб-сайта
* Пример:
*         100 000 ---> 100 K
*         100 001 ---> 100 K+
*         143 932 ---> 143 K+
*       1 843 932 ---> 1.8 M+
*     341 843 932 ---> 341 M+
*     341 000 000 ---> 341 M
*   1 032 042 322 ---> 1 B+
* 523 843 234 333 ---> 523 B+
* */

// дописать генерацию числел
public class MainApp {
    public static void main(String [] args) {
//        long userInput = (long) (Math.random() * 1_000_000_000_000L);
//        long userInput = (long) (Math.random() * 1_000_000_000);
        long userInput = (long) (Math.random() * 1_000_000);
//        long userInput = (long) (Math.random() * 1_000);
        long originNumber = userInput;
        System.out.println("Generated \"Subsribers\" number: " + userInput);

        if (userInput < 1_000) {
            System.out.println("Number for your page is: " + userInput);
        } else if (userInput == 1_000) {
            userInput /= 1_000;
            System.out.println("Short number for your page is: " + userInput + " K");
        } else if (userInput > 1_000 & userInput < 100_000) {
            userInput /= 1_000;
            if (originNumber == userInput * 1_000) {
                System.out.println("Short number for your page is: " + userInput + " K");
                return;
            }
            System.out.println("Short number for your page is: " + userInput + " K+");
        } else if (userInput == 100_000) {
            userInput /= 1_000;
            System.out.println("Short number for your page is: " + userInput + " K");
        } else if (userInput > 100_000 & userInput < 1_000_000) {
            userInput /= 1_000;
            if (originNumber == userInput * 1_000) {
                System.out.println("Short number for your page is: " + userInput + " K");
                return;
            }
            System.out.println("Short number for your page is: " + userInput + " K+");
        } else if (userInput == 1_000_000) {
            userInput /= 1_000_000;
            System.out.println("Short number for your page is: " + userInput + " M");
        } else if (userInput > 1_000_000 & userInput < 1_000_000_000) {
            userInput /= 1_000_000;
            if (originNumber == userInput * 1_000_000) {
                System.out.println("Short number for your page is: " + userInput + " M");
                return;
            }
            System.out.println("Short number for your page is: " + userInput + " M+");
        } else if (userInput == 1_000_000_000) {
            userInput /= 1_000_000_000;
            System.out.println("Short number for your page is: " + userInput + " B");
        } else if (userInput > 1_000_000_000 & userInput < 1_000_000_000_000L) {
            userInput /= 1_000_000_000;
            if (originNumber == userInput * 1_000_000_000) {
                System.out.println("Short number for your page is: " + userInput + " B");
                return;
            }
            System.out.println("Short number for your page is: " + userInput + " B+");
        }
    }
}