package tasks.task004;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import tasks.task004.logic.LogicActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task004LogicActionsTest {
    private int adminPassword = 1111;
    private int wrongPassword = 0;
    private String successResponse = "WELCOME TO PRIVATE ACCOUNT!!!";

    /*
    * Positive cases
    * */
    @Test
    public void testA() {
        System.out.println("Input: " + adminPassword);
        Assert.assertEquals(successResponse, LogicActions.inputPassword(adminPassword));
        System.out.println(successResponse);
    }
}