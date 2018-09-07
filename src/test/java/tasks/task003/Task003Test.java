package tasks.task003;

import org.junit.*;
import org.junit.runners.MethodSorters;
import tasks.task003.logic.LogicActions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task003Test {
    @BeforeClass
    public static void beforStart() {
        System.out.println("START TEST" + "\n" + "- - - - -");
    }

    @After
    public void afterTest() {
        System.out.println("- - - - -");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("FINISH TEST");
    }

    /*
    * Positive cases
    * */
    @Test
    public void testA() {
        int withNewLine = 5;
        System.out.print("Input: " + withNewLine);
        Assert.assertEquals(withNewLine, LogicActions.withNewLine(withNewLine));
    }

    @Test
    public void testB() {
        int withoutNewLine = 10;
        System.out.print("Input: " + withoutNewLine);
        Assert.assertEquals(withoutNewLine, LogicActions.withoutNewLine(withoutNewLine));
    }

    /*
    * Negative case
    * */
    @Test
    public void testNegativeA() {
        int withoutNewLine = 0;
        System.out.print("Input: " + withoutNewLine);
        Assert.assertEquals(withoutNewLine, LogicActions.withoutNewLine(withoutNewLine));
    }
}