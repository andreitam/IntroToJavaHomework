package ro.siit;

/**
 * The AlgorithmsSum class implements the algorithms that
 * calculates the sum of the first 100 numbers higher than 0
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
public class AlgorithmSum {
    /**
     * Method calculates the sum of the first 100 numbers higher than 0
     *
     * @return the sum of the first 100 numbers higher than 0
     */
    public static int sumFirstOnehundred() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

