package tasks.task_002;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;

import java.io.BufferedReader;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTest {
//    private MathActions mathActions;

    @Test
    public void testMethodA() {
        MathActions.getSmallestAndBiggestOfInputtedNumbers();
    }
}