package tasks.task_002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import tasks.task_002.math.MathActions;

public class TaskApp {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println(MathActions.getDifferenceBetweenDoubleFigureInfo(reader));
//        System.out.println(MathActions.getTheLargestOfTheThreeNumbers(reader));
        System.out.println(MathActions.getSmallestAndBiggestOfInputtedNumbers(reader));
    }
}