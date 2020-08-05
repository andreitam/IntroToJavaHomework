package ro.siit;

/**
 * The AlgorithmsPalindrome class implements the algorithms that
 * checks if a number is palindrom
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
public class AlgorithmPalindrome {
    /**
     * Method checking if a number is palindrom( e.g palindrom 1221, 34143)
     * Works with negative integers also.
     * Return void, BUT outputs a message if the number is
     * or is NOT palindrome.
     *
     * @param n the number to be checked
     * @return void
     */
    public static void palindromCheck(int n) {
        int number = n;
        int reversed = 0;
        //calculate reversed
        do {
            reversed = (reversed * 10) + n % 10;
            n = n / 10;
        }while(n != 0);
        if (number==reversed) {
            System.out.println("The number "+number+" is a palindrome");
        }
        else {
            System.out.println("The number "+number+" is NOT a palindrome");
        }
    }
}
