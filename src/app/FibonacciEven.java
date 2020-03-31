package app;

public class FibonacciEven{
    /**
     * Creates a sum of all the fibonacci numbers up to a value provided
     * @param value The Value that the fibonacci sequence should go up to.
     * @return The sum of the fibonacci sequences.
     */
    public static int fibonacciEven (int value){
        int current = 1;
        int previous = 1;
        int next = 0;
        int sum = 0;
        while (current <= value){
            next = current + previous;
            if (next % 2 ==0){sum = sum + next;}
            previous = current;
            current = next;
        }

        return sum;
    }

}