package ro.siit;

/**
 * The AlgorithmsPrime class implements the algorithms that
 * displays all the prime numbers lower than a given number
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
public class AlgorithmPrime {
    /**
     * Method for displaing all the prime numbers lower than a given number
     * Returns void, BUT prints the prime numbers.
     *
     * @param range the range for displaying the prime numbers
     * @return void
     */
    public static void primeNumbersDispaly(int range) {
        for (int i = 0;i <= range; i++) {
            if (Utilitaries.primeNumberCheck(i)==true) {
                System.out.print(" "+i+" ");
            }
        }
    }
}
