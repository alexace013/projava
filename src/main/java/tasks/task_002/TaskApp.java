package tasks.task_002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import tasks.task_002.math.MathActions;

public class TaskApp {
    public static void main(String [] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println(MathActions.task1(reader, 0));
        System.out.println(MathActions.task2(reader, 0, 0, 0));
//        System.out.println(MathActions.task3(reader, 0, 0, 0));
//        System.out.println(MathActions.task4(reader, 0));
//        System.out.println(MathActions.task5(reader, 0, 0));
    }
}