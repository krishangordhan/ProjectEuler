package app;

import java.util.ArrayList;
import java.util.List;

public class SummationOfPrimes {

    
    /**
     * Just goes through a loop from 2 onto the value supplied and returns the sum of all these prime numbers
     * @param value Number that you want the sum to.
     * @return The sum of all the prime numbers from 2 to value.
     */
    public static long calculate(int value) {
        long sum = 2;
        primeList.add(2);
        for (int i = 3; i < value; i += 2) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static List<Integer> primeList = new ArrayList<Integer>();
    /**
     * Finds out if a value is prime, expanded this and made it more efficent by defining an arraylist that it compares the prime numbers to as if a value can be divided
     * by a prime number than it is not a prime number.
     * @param value the value to check is boolean
     * @return true if boolean
     */
    public static boolean isPrime(int value) {
        if (value % 2 == 0) {
            return false;
        }
        
        for (int prime : primeList) {
            if (prime > Math.sqrt(value)){
                break;
            }    
            if (value % prime == 0) {
                return false;
            }
            
        }
        primeList.add(value);
        return true;
    }

}