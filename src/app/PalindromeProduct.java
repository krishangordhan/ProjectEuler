package app;


public class PalindromeProduct {

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



    public static boolean isPalindrome( String s )
    {
        //if odd length then remove middle character
        if ( s.length() % 2 != 0 )
        {
            s = s.substring( 0, s.length() / 2 ) + s.substring( (s.length() / 2) + 1);
        }

        return new StringBuffer( s.substring( 0, s.length() / 2) ).
                                 reverse().toString().equals( s.substring( s.length() / 2) );
    }
}