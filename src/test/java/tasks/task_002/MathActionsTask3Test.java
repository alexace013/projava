package tasks.task_002;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task_002.math.MathActions;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask3Test {
//    private MathActions mathActions;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    @Test
    public void testMethodA() {
        MathActions.task3(null, 1,2, 3);
    }

//    @Test
//    public void testMethodB() {
//
//    }
}