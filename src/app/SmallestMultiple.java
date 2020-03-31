package app;

public class SmallestMultiple{

    /**
     * Not the most elegant solution but returns the smallest number that is a multile of all numbers from 1-20, but if I just use the values 10-20 it should cover all 1-10.
     * @return The number that is the smallest integer of the multiples.
     */
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