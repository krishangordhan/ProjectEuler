package app;

public class SmallestMultiple{


    public static int smallestMultiple(){
        for (int i = 2520; i< Integer.MAX_VALUE; i = i + 20){
            if (i%10 == 0 &&
                i%11 == 0 &&
                i%12 == 0 &&
                i%13 == 0 &&
                i%14 == 0 &&
                i%16 == 0 &&
                i%17 == 0 &&
                i%18 == 0 &&
                i%19 == 0 &&
                i%20 == 0){
                    return i;
                }
        }
        return 0;
    }
  
}