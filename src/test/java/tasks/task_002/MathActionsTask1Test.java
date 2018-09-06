package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask1Test {
    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        int value = 11;
        Assert.assertEquals("0", MathActions.task1(null, value));
    }

    @Test
    public void testMethodB() {
        int value = 19;
        Assert.assertEquals("8", MathActions.task1(null, value));
    }

    @Test
    public void testMethodC() {
        int value = 50;
        Assert.assertEquals("5", MathActions.task1(null, value));
    }
}