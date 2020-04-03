package app;

public class DivisibleTriangularNumber {


    /**
     * Calculates the first triangular number that has the number of factors greater than max
     * @param max a badly named variable   
     * @return The triangular number that has the number of factors equal to max.
     */
    public static int calculate(int max){
        int value = 1;
        int count = 1;
        for (int i =1; count < Integer.MAX_VALUE; i++){
            count ++;
            value = value + count;

            if (numOfDivisors(value) > max){
                return value;
            }
        }


        return 0;
    }

    /**
     * Counts the number of divisors, uses every number up ot the sqrt(value).
     * @param value value to check divisors.
     * @return the number of divisors.
     */
    public static int numOfDivisors(int value){
        int count = 0;
        for (int i = 1; i <= Math.sqrt(value); i++){
            if (value % i == 0){
                if (value/i==i){count +=1;}
                else{count +=2;}
            }
        }
        return count;
    }
}