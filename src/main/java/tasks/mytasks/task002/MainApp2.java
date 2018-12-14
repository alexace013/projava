package tasks.mytasks.task002;

import java.util.Scanner;

/*
* Telephone Operator
* */
public class MainApp2 {
    static int zeroNumber = 0;
    static int oneNumber = 1;
    static int twoNumber = 2;
    static int threeNumber = 3;
    static String zeroText = ". СВЯЗЬ С ОПЕРАТОРОМ!";
    static String exit1 = "X";
    static String exit2 = "x";
    static String welcomeText = "Добро пожаловать в контакт центр Govnofone\u2122, \"Юзер\"";
    static String text1 = "\nДля выхода из контактного центра, введите символ \"X\" (и нажмите клавишу Enter)";
    static String text2 = "Чтобы перейти в конкретное меню, нажмите соответствующий номер (и нажмите клавишу Enter): ";


    public static void newCustomerCall() throws InterruptedException {
        String oneText = ". Проверить ваш баланс";
        String twoText = ". Пополнить ваш баланс";
        String threeText = ". Новые акции";

        System.out.println(welcomeText);
        Thread.sleep(3000);

        System.out.println(oneNumber + oneText);
        Thread.sleep(250);
        System.out.println(twoNumber + twoText);
        Thread.sleep(250);
        System.out.println(threeNumber + threeText);
        Thread.sleep(250);
        System.out.println(zeroNumber + zeroText);
        Thread.sleep(250);

        Thread.sleep(500);
        System.out.print(text1 + "\n" + text2);
        Scanner scanner = new Scanner(System.in);
        String customerValue = scanner.next();

        switch (customerValue) {
            case "0":
                System.out.println(String.format("\n" + zeroNumber + zeroText.toUpperCase()));
                connectToOperator();
                break;
            case "1":
                System.out.println(String.format("\n" + oneNumber + oneText.toUpperCase()));
                checkMoney();
                break;
            case "2":
                System.out.println(String.format("\n" + twoNumber + twoText.toUpperCase()));
                topUpMoney();
                break;
            case "3":
                System.out.println(String.format("\n" + threeNumber + threeText.toUpperCase()));
                stocksInStore();
                break;
            default:
                System.out.println("НИЧЕГО");
        }
    }

    private static void checkMoney() throws InterruptedException {
        String oneText = ". Проверить ваш текущий баланс";
        String twoText = ". Проверить баланс вашего друга";

        System.out.println("---> " + oneNumber + oneText);
        Thread.sleep(250);
        System.out.println("---> " + twoNumber + twoText);
        Thread.sleep(250);
        System.out.println("---> " + zeroNumber + zeroText);
        Thread.sleep(250);

        System.out.print("\nЧтобы перейти в конкретное меню, нажмите соответствующий номер (и нажмите клавишу Enter): ");
        Scanner scanner = new Scanner(System.in);
        String customerValue = scanner.next();

        switch (customerValue) {
            case "0":
                System.out.println(String.format("\n" + zeroNumber + zeroText.toUpperCase()));
                connectToOperator();
                break;
            case "1":
                System.out.println(String.format("\n" + oneNumber + oneText.toUpperCase()));
                currentMoneyStatusIs();
                break;
            case "2":
                System.out.println(String.format("\n" + twoNumber + twoText.toUpperCase()));
                currentMoneyStatusYourFriendIs();
                break;
            default:
                System.out.println("НИЧЕГО");
        }
    }

    private static void topUpMoney() throws InterruptedException {
        String oneText = ". Пополнить на 5 долларов";
        String twoText = ". Пополнить на 10 долларов";
        String threeText = ". Пополнить на 25 долларов";

        System.out.println("---> " + oneNumber + oneText);
        Thread.sleep(250);
        System.out.println("---> " + twoNumber + twoText);
        Thread.sleep(250);
        System.out.println("---> " + threeNumber + threeText);
        Thread.sleep(250);
        System.out.println("---> " + zeroNumber + zeroText);
        Thread.sleep(250);

        System.out.print("\nЧтобы перейти в конкретное меню, нажмите соответствующий номер (и нажмите клавишу Enter): ");
        Scanner scanner = new Scanner(System.in);
        String customerValue = scanner.next();

        switch (customerValue) {
            case "1":
                System.out.println(String.format("\n" + oneNumber + oneText.toUpperCase()));
                topUpOn$5();
                break;
            case "2":
                System.out.println(String.format("\n" + oneNumber + twoText.toUpperCase()));
                topUpOn$10();
                break;
            case "3":
                System.out.println(String.format("\n" + oneNumber + threeText.toUpperCase()));
                topUpOn$25();
                break;
            default:
                System.out.println("НИЧЕГО");
        }
    }

    private static void stocksInStore() {

    }

    private static void currentMoneyStatusIs() {
        System.out.println("---> " + "Ваш баланс: 25 долларов");
    }

    private static void currentMoneyStatusYourFriendIs() {
        System.out.println("---> " + "Баланс друга \"Сирко\" равен: 5 долларов");
    }

    private static void topUpOn$5() {
        System.out.println("---> " + "Ваш баланс пополнен на: 5 долларов");
    }

    private static void topUpOn$10() {
        System.out.println("---> " + "Ваш баланс пополнен на: 10 долларов");
    }

    private static void topUpOn$25() {
        System.out.println("---> " + "Ваш баланс пополнен на: 25 долларов");
    }

    private static void connectToOperator() {
        System.out.println("---> " + "Выполняется соединение с оператором, \"Леночка\"...");
    }

    public static void main(String [] args) throws InterruptedException {
        newCustomerCall();
    }
}