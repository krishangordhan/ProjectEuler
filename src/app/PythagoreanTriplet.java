package app;

public class PythagoreanTriplet{

    /**
     * Calculates the numbers that would add up to value that are also pythagorean, This is not the best method for this calculation as it is brute force and as value gets 
     * larger the O(n) cost will get absurd, there is likely a way to simplify this maths down.
     * @param value The value that the 3 pythagorean numbers will add up to.
     * @return The product of the 3 pythagorean values.
     */
    public static int calculate(int value){
        for (int a = 1; a<1000;a++){
            for (int b = a; b<value-a;b++){
                int c = value - a - b;
                if (a * a + b * b == c * c){
                    System.out.println("a: " + a);
                    System.out.println("b: " + b);
                    System.out.println("c: " + c);
                    return a*b*c;
                }
            }
        }

        return 0;
    }


}