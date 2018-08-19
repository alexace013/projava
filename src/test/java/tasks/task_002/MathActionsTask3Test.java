package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask3Test {
    @Test
    public void testMethodA() {
        Assert.assertEquals("1 3",  MathActions.task3(null, 1,2, 3));
    }

    @Test
    public void testMethodB() {
        Assert.assertEquals("1 2",  MathActions.task3(null, 1,2, 2));
    }

    @Test
    public void testMethodC() {
        Assert.assertEquals("1 2",  MathActions.task3(null, 1,1, 2));
    }

    @Test
    public void testMethodD() {
        Assert.assertEquals("1 3",  MathActions.task3(null, 3,2, 1));
    }

    @Test
    public void testMethodE() {
        Assert.assertEquals("1 2",  MathActions.task3(null, 2,1, 2));
    }

    @Test
    public void testMethodF() {
        Assert.assertEquals("1 2",  MathActions.task3(null, 2,2, 1));
    }

    @Test
    public void testMethodG() {
        Assert.assertEquals("1 2",  MathActions.task3(null, 1,2, 1));
    }

    @Test
    public void testMethodH() {
        Assert.assertEquals("1 3",  MathActions.task3(null, 2,1, 3));
    }

    @Test
    public void testMethodI() {
        Assert.assertEquals("1 3",  MathActions.task3(null, 2,3, 1));
    }

    @Test
    public void testMethodJ() {
        Assert.assertEquals("1",  MathActions.task3(null, 1,1, 1));
    }
}