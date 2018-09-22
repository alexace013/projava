package tasks.glava01.optionA.task005.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class ActionsApp {
    public static int getSum() {
        ArrayList <Integer> arrayList = new ArrayList<>();
        int userNumber = 0;
        int exitFromApp = -1;
        int composition = 1;

        while (userNumber != exitFromApp) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number (for exit use \"-1\" digit): ");
            userNumber = scanner.nextInt();
            if (userNumber == exitFromApp) {
                break;
            }
            arrayList.add(userNumber);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            composition *= arrayList.get(i);
        }
        return composition;
    }
}