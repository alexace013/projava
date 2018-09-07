package tasks.task_002;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask5Test {
    /*
    * Positive cases
    * */
    @Test
    public void testMethodA() {
        int firstDigit = 1;
        int secondDigit = 1;
        System.out.println("Input: " + firstDigit + " and " + secondDigit);
        Assert.assertEquals("Координаты расположены в первой четверти (в правом верхнем углу)", MathActions.task5(null, firstDigit, secondDigit));
        System.out.println();
    }

    @Test
    public void testMethodB() {
        int firstDigit = -1;
        int secondDigit = 1;
        System.out.println("Input: " + firstDigit + " and " + secondDigit);
        Assert.assertEquals("Координаты расположены во второй четверти (в левом верхнем углу)", MathActions.task5(null, firstDigit, secondDigit));
        System.out.println();
    }

    @Test
    public void testMethodC() {
        int firstDigit = -1;
        int secondDigit = -1;
        System.out.println("Input: " + firstDigit + " and " + secondDigit);
        Assert.assertEquals("Координаты расположены в третей четверти (в левом нижнем углу)", MathActions.task5(null, firstDigit, secondDigit));
        System.out.println();
    }

    @Test
    public void testMethodD() {
        int firstDigit = 1;
        int secondDigit = -1;
        System.out.println("Input: " + firstDigit + " and " + secondDigit);
        Assert.assertEquals("Координаты расположены в четвертой четверти (в правом нижнем углу)", MathActions.task5(null, firstDigit, secondDigit));
        System.out.println();
    }

    /*
    * Negative case
    * */
    @Test
    public void testMethodNegativeA() {
        int firstDigit = 0;
        int secondDigit = 0;
        System.out.println("Input: " + firstDigit + " and " + secondDigit);
        Assert.assertEquals("Координатов нет!", MathActions.task5(null, firstDigit, secondDigit));
        System.out.println();
    }
}