package tasks.course;

import static org.junit.Assert.assertEquals;
import static tasks.course.math.MathActions.task2;
import static java.lang.System.out;
import static java.lang.String.format;
import static java.lang.Integer.parseInt;

import lombok.extern.log4j.Log4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@Log4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask2Test extends MathActionsConstants {

    @Test
    public void positiveTestMethodABC() {
        out.println(format(INPUT_MSG, A));
        log.info(format(INPUT_MSG, A));
        out.println(format(INPUT_MSG, B));
        log.info(format(INPUT_MSG, B));
        out.println(format(INPUT_MSG, C));
        log.info(format(INPUT_MSG, C));
        assertEquals(3, parseInt(task2(null, A, B, C)));
    }

    @Test
    public void positiveTestMethodCBA() {
        out.println(format(INPUT_MSG, C));
        log.info(format(INPUT_MSG, C));
        out.println(format(INPUT_MSG, B));
        log.info(format(INPUT_MSG, B));
        out.println(format(INPUT_MSG, A));
        log.info(format(INPUT_MSG, A));
        assertEquals(3, parseInt(task2(null, C, B, A)));
    }

    @Test
    public void positiveTestMethodCCC() {
        out.println(format(INPUT_MSG, C));
        log.info(format(INPUT_MSG, C));
        out.println(format(INPUT_MSG, C));
        log.info(format(INPUT_MSG, C));
        out.println(format(INPUT_MSG, C));
        log.info(format(INPUT_MSG, C));
        assertEquals(3, parseInt(task2(null, C, C, C)));
    }
}