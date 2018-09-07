package tasks.course;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.course.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask4Test {
    private int a = 1234567;
    private int b = 9999999;
    private int c = 0000001;

    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        System.out.println("Input: " + a);
        Assert.assertEquals("Среднее арифметическое: 4", MathActions.task4(null, a));
    }

    @Test
    public void testMethodB() {
        System.out.println("Input: " + b);
        Assert.assertEquals("Среднее арифметическое: 9", MathActions.task4(null, b));
    }

    @Test
    public void testMethodС() {
        System.out.println("Input: " + c);
        Assert.assertEquals("Среднее арифметическое: 0", MathActions.task4(null, c));
        System.out.println();
    }
}