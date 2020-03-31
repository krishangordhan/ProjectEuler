package app;

public class PrimeFactors{

    /**
     * I am not actually sure why this works, but my maths friend said this would work.
     * @param value the value that we will calculate the factors from
     * @return the factor!
     */
    public static long primeFactors(long value){
        long n = value;
        int i = 2;

        while (i *i < n){
            while (n%i == 0){
                n = n / i;
            }
            i = i + 1;

        }

        return n;
    }



}

