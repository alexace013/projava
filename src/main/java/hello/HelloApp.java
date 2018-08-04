package hello;

import static java.lang.System.out;

import user.User;

import java.util.Scanner;

// Create a Hello class that will welcome any user using the command line.

public class HelloApp {

    private static Scanner scanner;
    private static User user;

    public static void main(String[] args) {
        out.print("input name: ");
        scanner = new Scanner(System.in);
        user = new User(scanner.nextLine());
        out.println(HelloAction.getSaluteUserText(user));
    }
}
