package ro.siit;

/**
 * The AlgorithmsMax class implements the algorithms that
 * displays the max digit from a number.
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
public class AlgorithmMax {
    /**
     * Method for displaing the max digit from a number.
     * Works with negative integers also
     *
     * @param n the number to be checked
     * @return the biggest digit from the input n number
     */
    public static int maxDigitFromNumber(int n) {
        int max = 0;
        while (n != 0) {
            int rem = n % 10;
            if (Math.abs(rem) >= max) {
                max = Math.abs(rem);
            }
            n = n / 10;
        }
        return max;
    }
}
