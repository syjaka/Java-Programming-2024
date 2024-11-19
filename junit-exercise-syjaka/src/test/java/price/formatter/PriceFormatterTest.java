package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class.
 */
public class PriceFormatterTest {

    PriceFormatter formatter = new PriceFormatter();
    /*
     * The formatPrice method takes a double as a parameter and returns a String:
     *
     * PriceFormatter formatter = new PriceFormatter();
     * String formatted = formatter.formatPrice(Math.PI); // 3.14 €
     *
     * Call the method with different values in your tests and check that the
     * returned Strings match the specification.
     */

    @Test
    void testThousandsAreSeparated() {
        assertEquals("2 000 €", formatter.formatPrice(2000));
    }

    @Test
    void testDecimalsAreRoundedToNearestCent() {
        assertEquals("1,01 €", formatter.formatPrice(1.0099));
        assertEquals("1,01 €", formatter.formatPrice(1.0129999));
    }

    @Test
    void testDecimalsAreDeletedUponRounding() {
        assertEquals("2 €", formatter.formatPrice(1.999));
        assertEquals("2 €", formatter.formatPrice(2.001));
    }

    @Test
    void testDecimalsAreSeparatedByComma() {
        assertEquals("1,10 €", formatter.formatPrice(1.10));
    }

}
