package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class DayOfYearTest {
    // public static int dayOfYear(int month, int dayOfMonth, int year)

    DayOfYear counter = new DayOfYear();

    @Test
    void firstDayOfyear() {
        assertEquals(1, counter.dayOfYear(1, 1, 2000));
    }

    @Test
    void lastDayOfYear() {
        assertEquals(365, counter.dayOfYear(12, 31, 0001));
    }

    @Test
    void lastDayOfLeapYear() {
        assertEquals(366, counter.dayOfYear(12, 31, 2024));
    }

    @Test
    void lastDayOfMonth1() {
        assertEquals(31, counter.dayOfYear(1, 31, 2024));
    }

    @Test
    void lastDayOfMonth2NonLeapYear() {
        assertEquals(59, counter.dayOfYear(2, 28, 2023));
    }

    @Test
    void lastDayOfMonth2LeapYear() {
        assertEquals(60, counter.dayOfYear(2, 29, 2024));
    }

    @Test
    void handlingInvalidDateParameters() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    counter.dayOfYear(2000, 12, 3);
                    throw new IllegalArgumentException("Anna kelvollinen päivämäärä");
                });

    }

}
