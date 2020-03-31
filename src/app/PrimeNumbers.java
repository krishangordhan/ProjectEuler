package app;

public class PrimeNumbers{


    /**
     * Just loops through all numbers counting if its a prime number as well as just counting each loop, return the nth prime number.
     * @param n The nth prime number you want to recieve. 
     * @return The nth prime number
     */
    public static int calculate(int n){
        int primeValue = 1;
        int primeCount = 1;

        while (primeValue < n ){
            primeCount +=1;
            if (isPrime(primeCount)){
                primeValue += 1;
                System.out.println(primeCount);           
            }
        }

        return primeCount;
    }

    /**
     * Returns true if value is prime, it first checks if even number, after that it takes the sqroot of every odd value and goes up from there and checks 
     * @param value Number to be checked if prime.
     * @return True if its a prime number.
     */
    public static boolean isPrime(int value){
        if (value %2 ==0){
            return false;
        }
        for (int i = 3; i < (value ^(1/2)+1); i = i + 2){
            if(value%i ==0){return false;}
        }

        return true;
    }

}