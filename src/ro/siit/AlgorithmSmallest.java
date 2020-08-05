package ro.siit;

/**
 * The AlgorithmsSmallest class implements the algorithms that
 * displays the smallest number from an array of number
 *
 * @author  Andrei Tamasanu
 * @version 1.0
 * @since   2020-08-05
 */
public class AlgorithmSmallest {
    /**
     * Method displays the smallest number from an array of number
     *
     * @param arr an integer array.
     * @return the smallest number in the array
     */
    public static int smallestNumberInArray(int[] arr) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
