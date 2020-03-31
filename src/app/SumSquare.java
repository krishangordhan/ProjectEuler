package app;

public class SumSquare{

    /**
     * Calculates the sum of all squares and the square of the sum upto a value.
     * @param value Provided value that gets summed up to.
     * @return The square of the sum minus the sum of the squares.
     */
    public static int calculate(int value){
        int sumSquare = 0;
        int squareSum = 0;
        
        for (int i = 1; i<=value; i++){
            sumSquare = sumSquare + (i*i);
            squareSum = squareSum + i;


        }
        squareSum = squareSum * squareSum;


        return squareSum - sumSquare;
    }



}