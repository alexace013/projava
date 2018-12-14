package tasks.course;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.course.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask4Test {
    private static final int A = 1234567;
    private static final int B = 9999999;
    private static final int C = 0000001;

    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        System.out.println("Input: " + A);
        Assert.assertEquals("Среднее арифметическое: 4", MathActions.task4(null, A));
    }

    @Test
    public void testMethodB() {
        System.out.println("Input: " + B);
        Assert.assertEquals("Среднее арифметическое: 9", MathActions.task4(null, B));
    }

    @Test
    public void testMethodС() {
        System.out.println("Input: " + C);
        Assert.assertEquals("Среднее арифметическое: 0", MathActions.task4(null, C));
        System.out.println();
    }
}