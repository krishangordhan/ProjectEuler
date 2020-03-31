package app;


public class PalindromeProduct {

    /**
     * Loops through all integers that are 3 digits, starting with big to small, and compares it to the current biggest one replaces if need be, It looks only for palindromes
     * @return The biggest integer that is a palindrome.
     */
    public static int palindromeBiggest() {
        int biggest = 0;
        int current = 0;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                current = i * j;
                if(isPalindrome(Integer.toString(current))){ 
                    if (current > biggest){
                        System.out.println(biggest);
                        biggest = current;
                    }
                }
            }

        }
        return biggest;
    }


    /**
     * It isn't the best palindrome checked but if the string is odd length, then remove the middle character, and then use StringBuffer to compare it to the reverse
     * @param s String to check if palindrome
     * @return True if string is palindrome
     */
    public static boolean isPalindrome( String s )
    {
        if ( s.length() % 2 != 0 )
        {
            s = s.substring( 0, s.length() / 2 ) + s.substring( (s.length() / 2) + 1);
        }

        return new StringBuffer( s.substring( 0, s.length() / 2) ).
                                 reverse().toString().equals( s.substring( s.length() / 2) );
    }
}