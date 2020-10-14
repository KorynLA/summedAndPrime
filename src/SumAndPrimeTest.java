import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests
 * Value with 1 digit: 3
 * Value with 2 digits: 15
 * Value with 3 digits: 771
 * Value with 4 digits: 9999
 * Value with 5 digits: 10000
 * Value that is prime: 15 - 6
 * Value that is not prime: 10000 - 1
 * Prime Edge Cases
 * Digit value: 1
 * Digit value: 2
 */
public class SumAndPrimeTest {
    private SumAndPrime testExample = new SumAndPrime();
    private final int singlePrimeDigit = 3;
    private final int twoNonPrimeDigits = 15;
    private final int threePrimeDigits = 775;
    private final int fourNonPrimeDigits = 9999;
    private final int fivePrimeDigits = 10000;
    private final int twoNonPrimeSummedDigit = 6;
    private final int fivePrimeSummedDigit = 1;

    @Test
    public void sumSingleDigit_shouldReturn3() {
        assertEquals(3, testExample.sumDigits(singlePrimeDigit));
    }

    @Test
    public void sumTwoDigits_shouldReturn6() {
        assertEquals(6, testExample.sumDigits(twoNonPrimeDigits));
    }
    @Test
    public void sumThreeDigits_shouldReturn19() {
        assertEquals(19, testExample.sumDigits(threePrimeDigits));
    }
    @Test
    public void sumFourDigits_shouldReturn36() {
        assertEquals(36, testExample.sumDigits(fourNonPrimeDigits));
    }
    @Test
    public void sumFiveDigits_shouldReturn1() {
        assertEquals(1, testExample.sumDigits(fivePrimeDigits));
    }
    @Test
    public void isPrime_shouldReturnTrue() {
        assertEquals(true, testExample.isPrime(fivePrimeSummedDigit));
    }
    @Test
    public void isNonPrime_shouldReturnFalse() {
        assertEquals(false, testExample.isPrime(twoNonPrimeSummedDigit));
    }
    @Test
    public void isPrimeEdgeCase2_shouldReturnTrue() {
        assertEquals(true, testExample.isPrime(2));
    }
    @Test
    public void isPrimeEdgeCase1_shouldReturnTrue() {
        assertEquals(true, testExample.isPrime(1));
    }
}