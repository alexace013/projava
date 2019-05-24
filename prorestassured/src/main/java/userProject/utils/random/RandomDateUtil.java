package userProject.utils.random;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 * Specific util included only one static method
 * can get random date in a specific range if it needed
 */
public class RandomDateUtil {

    private static final int CONST_DATE_1 = 1970;
    private static final int CONST_DATE_2 = LocalDate.now().getYear();

    /**
     * This static method can get random date in a default specific range
     */
    public static String getRandomDate() {
        return getRandomDate(CONST_DATE_1, CONST_DATE_2);
    }

    /**
     * This private static method can get random date in a specific range
     *
     * @param date1 date from a year
     * @param date2 date to a year
     * @return random date between date1 and date2
     */
    public static String getRandomDate(final int date1, final int date2) {
        GregorianCalendar calendar = new GregorianCalendar();
        final int year = randBetween(date1, date2);
        final int dayOfYear = randBetween(1, calendar.getActualMaximum(calendar.DAY_OF_YEAR));
        calendar.set(calendar.YEAR, year);
        calendar.set(calendar.DAY_OF_YEAR, dayOfYear);
        return String.format("%d-%d-%d",
                calendar.get(calendar.YEAR),
                calendar.get(calendar.MONTH) + 1,
                calendar.get(calendar.DAY_OF_MONTH)
        );
    }

    /**
     * This static private method can get different between date1 and date2
     *
     * @param value1 from a year
     * @param value2 to a year
     * @return different value between date1 and date2
     */
    private static int randBetween(final int value1, final int value2) {
        return value1 + (int) Math.round(Math.random() * (value2 - value1));
    }
}