package app;


public class MultipleOf35 {

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
