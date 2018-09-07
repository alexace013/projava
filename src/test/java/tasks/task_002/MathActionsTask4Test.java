package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask4Test {
    @Test
    public void testMethodA() {
        int a = 1234567;
        Assert.assertEquals("Среднее арифметическое: 4", MathActions.task4(null, a));
    }
}