package lv.sdacademy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LeapYearTest {

    @Test
    public void isLeapYear() {
        assertTrue(LeapYear.isLeapYear(1996));
        assertFalse(LeapYear.isLeapYear(2001));
        assertTrue(LeapYear.isLeapYear(2000));
        assertFalse(LeapYear.isLeapYear(1900));
    }
}
