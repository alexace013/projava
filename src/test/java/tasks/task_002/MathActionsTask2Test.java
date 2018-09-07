package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask2Test {
    private int a = 1;
    private int b = 2;
    private int c = 3;

    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        System.out.println("Input: " + a);
        Assert.assertEquals("3", MathActions.task2(null, a, b, c));
    }

    @Test
    public void testMethodB() {
        System.out.println("Input: " + b);
        Assert.assertEquals("3", MathActions.task2(null, c, b, a));
    }

    @Test
    public void testMethodC() {
        System.out.println("Input: " + c);
        Assert.assertEquals("3", MathActions.task2(null, c, c, c));
        System.out.println();
    }
}