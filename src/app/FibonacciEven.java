package app;

public class FibonacciEven{

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