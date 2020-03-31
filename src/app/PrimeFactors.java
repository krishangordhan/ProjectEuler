package app;

public class PrimeFactors{

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

