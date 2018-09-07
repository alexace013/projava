package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask3Test {
    private int one = 1;
    private int two = 2;
    private int three = 3;

    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        System.out.println("Input : " + one);
        System.out.println("Input : " + two);
        System.out.println("Input : " + three);
        Assert.assertEquals("1 3",  MathActions.task3(null, one, two, three));
        System.out.println();
    }

    @Test
    public void testMethodB() {
        System.out.println("Input : " + one);
        System.out.println("Input : " + two);
        System.out.println("Input : " + two);
        Assert.assertEquals("1 2",  MathActions.task3(null, one, two, two));
        System.out.println();
    }

    @Test
    public void testMethodC() {
        System.out.println("Input : " + one);
        System.out.println("Input : " + one);
        System.out.println("Input : " + two);
        Assert.assertEquals("1 2",  MathActions.task3(null, one, one, two));
        System.out.println();
    }

    @Test
    public void testMethodD() {
        System.out.println("Input : " + three);
        System.out.println("Input : " + two);
        System.out.println("Input : " + one);
        Assert.assertEquals("1 3",  MathActions.task3(null, three, two, one));
        System.out.println();
    }

    @Test
    public void testMethodE() {
        System.out.println("Input : " + two);
        System.out.println("Input : " + one);
        System.out.println("Input : " + two);
        Assert.assertEquals("1 2",  MathActions.task3(null, two, one, two));
        System.out.println();
    }

    @Test
    public void testMethodF() {
        System.out.println("Input : " + two);
        System.out.println("Input : " + two);
        System.out.println("Input : " + one);
        Assert.assertEquals("1 2",  MathActions.task3(null, two, two, one));
        System.out.println();
    }

    @Test
    public void testMethodG() {
        System.out.println("Input : " + one);
        System.out.println("Input : " + two);
        System.out.println("Input : " + one);
        Assert.assertEquals("1 2",  MathActions.task3(null, one, two, one));
        System.out.println();
    }

    @Test
    public void testMethodH() {
        System.out.println("Input : " + two);
        System.out.println("Input : " + one);
        System.out.println("Input : " + three);
        Assert.assertEquals("1 3",  MathActions.task3(null, two, one, three));
        System.out.println();
    }

    @Test
    public void testMethodI() {
        System.out.println("Input : " + two);
        System.out.println("Input : " + three);
        System.out.println("Input : " + one);
        Assert.assertEquals("1 3",  MathActions.task3(null, two, three, one));
        System.out.println();
    }

    @Test
    public void testMethodJ() {
        System.out.println("Input : " + one);
        System.out.println("Input : " + one);
        System.out.println("Input : " + one);
        Assert.assertEquals("1",  MathActions.task3(null, one, one, one));
        System.out.println();
    }
}