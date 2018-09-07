package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask1Test {
    private int value1 = 11;
    private int value2 = 19;
    private int value3 = 50;

    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        System.out.println("Input: " + value1);
        Assert.assertEquals("0", MathActions.task1(null, value1));
    }

    @Test
    public void testMethodB() {
        System.out.println("Input: " + value2);
        Assert.assertEquals("8", MathActions.task1(null, value2));
    }

    @Test
    public void testMethodC() {
        System.out.println("Input: " + value3);
        Assert.assertEquals("5", MathActions.task1(null, value3));
        System.out.println();
    }
}