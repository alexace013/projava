package tasks.course;

import static org.junit.Assert.assertEquals;
import static java.lang.String.format;
import static tasks.course.math.MathActions.task1;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;

import lombok.extern.log4j.Log4j;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@Log4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathActionsTask1Test extends MathActionsConstants {

    @Test
    public void positiveTestMethodValue11() {
        value = 11;
        msg = format(INPUT_MSG, value);
        assert msg != null;
        log.info(msg);
        out.println(msg);
        assertEquals(0, parseInt(task1(null, value)));
    }

    @Test
    public void positiveTestMethodValue19() {
        value = 19;
        msg = format(INPUT_MSG, value);
        assert msg != null;
        log.info(msg);
        out.println(msg);
        assertEquals(8, parseInt(task1(null, value)));
    }

    @Test
    public void positiveTestMethodValue50() {
        value = 50;
        msg = format(INPUT_MSG, value);
        assert msg != null;
        log.info(msg);
        out.println(msg);
        assertEquals(5, parseInt(task1(null, value)));
    }

    @Test
    public void positiveTestMethodValueNull() {
        assert msg == null;
    }
}