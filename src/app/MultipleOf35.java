package app;


public class MultipleOf35 {

    /**
     * Returns the sum of all the numbers up to provided value if the number is a multiple of 3 or 5
     * @param value The value that it will calculate the sum too
     * @return The sum of the multiples of 3 and 5
     */
    public static int multipleOf35(int value){
        int sum = 0;
        for (int i=1; i< value ;i++){
            if (i % 3 == 0 || i % 5 ==0){
                
                sum = sum + i;
            }
        }
        return sum;
    }

}
