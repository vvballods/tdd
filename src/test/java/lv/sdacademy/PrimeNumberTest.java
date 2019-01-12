package lv.sdacademy;

import org.junit.Test;

import static lv.sdacademy.PrimeNumber.isPrime;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PrimeNumberTest {
    @Test
    public void testPrimeNumbers() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(13));
        assertTrue(isPrime(1663));
        assertTrue(isPrime(6581));
        assertTrue(isPrime(7919));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(isPrime(1));
        assertFalse(isPrime(4));
        assertFalse(isPrime(12));
        assertFalse(isPrime(3435));
        assertFalse(isPrime(666));
        assertFalse(isPrime(999));
    }
}
