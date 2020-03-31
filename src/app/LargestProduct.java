package app;

import java.util.ArrayList;

public class LargestProduct{

    /**
     * This calculates the largest adjacent number in a stream of 1000 characters. Ran into a hiccup with the int limit. Could have made a smarter method by realising that since its 
     * adjacent numbers I could have just used the previous 12 numbers but oh well.
     * @return The largest sum as a long, its a long as we break the int limit.
     */
    public static long calculate(){
        /**
         * I should put this in a text file but oh well.
         */
        long biggest = 0;
        int li = 12;
        long product;
        String raw = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println(raw.length());
        for (int i = 0; i< raw.length(); i++){
            numbers.add(Character.getNumericValue(raw.charAt(i)));
        }
        System.out.println(numbers.size());
        for (int i = 0; li< numbers.size(); i++){
            product = 1;
            String test = "";
            for (int j = i; j< li + 1; j++){
                product = product * numbers.get(j);
                test = test + numbers.get(j);
            }
            if (product > biggest){biggest = product;
            ;}
            li+=1;
        }

        return biggest;
    }


}