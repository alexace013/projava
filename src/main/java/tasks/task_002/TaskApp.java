package tasks.task_002;

import tasks.task_002.math.MathActions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskApp {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(MathActions.getDifferenceBetweenTwoNumbersInfo(reader));
        System.out.println(MathActions.getTheLargestOfTheThreeNumbers(reader));
    }
}