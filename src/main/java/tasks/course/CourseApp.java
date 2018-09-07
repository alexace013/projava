package tasks.course;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import tasks.course.math.MathActions;

public class CourseApp {
    public static void main(String [] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(MathActions.task1(reader, 0));
        System.out.println(MathActions.task2(reader, 0, 0, 0));
        System.out.println(MathActions.task3(reader, 0, 0, 0));
        System.out.println(MathActions.task4(reader, 0));
        System.out.println(MathActions.task5(reader, 0, 0));
    }
}