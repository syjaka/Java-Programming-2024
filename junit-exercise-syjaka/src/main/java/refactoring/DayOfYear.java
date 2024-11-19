package refactoring;

import java.time.*;

/**
 * Smelly Example #1
 *
 * https://web.mit.edu/6.005/www/fa16/classes/04-code-review/
 *
 * Collaboratively authored with contributions from: Saman Amarasinghe, Adam
 * Chlipala, Srini Devadas, Michael Ernst, Max Goldman, John Guttag, Daniel
 * Jackson, Rob Miller, Martin Rinard, and Armando Solar-Lezama.
 *
 * This work is licensed under CC BY-SA 4.0.
 */
public class DayOfYear {

    /**
     * "The day of year (DOY) is the sequential day number starting with day 1 on
     * January 1st."
     *
     * https://nsidc.org/data/user-resources/help-center/day-year-doy-calendar
     *
     * This method calculates the day of the year (1-366) that corresponds to the
     * given month, day of month, and year. January 1st is day 1 of the year and
     * December 31st is day 365 (or 366 in a leap year).
     *
     * @param month      the month (1-12)
     * @param dayOfMonth the day of the month (1-31)
     * @param year       the year
     * @return the day of the year (1-366)
     */
    public static int dayOfYear(int month, int dayOfMonth, int year) {

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Annetun kuukauden tulee olla välillä 1-12. ");
        }
        if (dayOfMonth < 1 || dayOfMonth > 31) {
            throw new IllegalArgumentException("Annetun päivän tulee olla väliltä 1-31. ");
        }
        if (year < 1) {
            throw new IllegalArgumentException("Vuosi ei voi olla ennen EKR ");
        }

        try {
            LocalDate date = LocalDate.of(year, month, dayOfMonth);
            int dayOfYear = date.getDayOfYear();
            return dayOfYear;
        } catch (Exception e) {
            throw new IllegalArgumentException("Annettu päivämäärä ei ole oikea. ");
        }

        /*
         * You are expected to change this method in the exercise in order to fix the
         * bugs in it. You are also expected to improve the method's structure and
         * style to make it more readable and maintainable.
         *
         * You are allowed to throw runtime exceptions, such as
         * IllegalArgumentException, if the inputs are invalid.
         *
         * However, you are *not* allowed to change the method signature (name,
         * parameters, return type).
         */

        // if (month == 2) {
        // dayOfMonth += 31;
        // } else if (month == 3) {
        // dayOfMonth += 59;
        // } else if (month == 4) {
        // dayOfMonth += 90;
        // } else if (month == 5) {
        // dayOfMonth += 31 + 28 + 31 + 30;
        // } else if (month == 6) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31;
        // } else if (month == 7) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
        // } else if (month == 8) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
        // } else if (month == 9) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        // } else if (month == 10) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        // } else if (month == 11) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        // } else if (month == 12) {
        // dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
        // }
    }
}
