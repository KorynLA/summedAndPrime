/**
 * Class that prints to screen the prime summed digits from 1-10000
 */
public class SumAndPrime {
    /**
     * Takes in the number to sum the digits of and returns the summed digit value
     * @param digit as int
     * @return summedDigit as int
     */
    public static int sumDigits(int digit){
        int summedDigits = 0;
        while(digit > 0) {
            summedDigits+=digit%10;
            digit/=10;
        }
        return summedDigits;
    }

    /**
     * Takes in integer value and returns if it is prime
     * @param sum as int
     * @return boolean
     */
    public static boolean isPrime(int sum) {
        if(sum%2 == 0 && sum != 2) {
            return false;
        }
        for(int i=3; i < sum; i+=2) {
            if(sum%i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main used to run functions to find the summed digit and if the resulting value is prime.
     * Prints the prime summed digit to the screen.
     * @param args
     */
    public static void main(String[] args) {
        for(int i=1; i < 100001; i++) {
            int summedDigit = sumDigits(i);
            if(isPrime(summedDigit)) {
                System.out.print(""+summedDigit+" ");
            }
        }
    }
}