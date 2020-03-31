package app;

public class SumSquare{
    public static int calculate(int value){
        int sumSquare = 0;
        int squareSum = 0;
        
        for (int i = 1; i<=value; i++){
            sumSquare = sumSquare + (i*i);
            squareSum = squareSum + i;


        }
        System.out.println(squareSum);
        System.out.println(sumSquare);
        squareSum = squareSum * squareSum;


        return squareSum - sumSquare;
    }



}