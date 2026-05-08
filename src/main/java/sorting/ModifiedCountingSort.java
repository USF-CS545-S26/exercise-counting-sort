package sorting;

import java.util.Arrays;

public class ModifiedCountingSort {
    /**
     * Implementation of the modified counting sort
     * @param arr input array
     * @param maxValue largest possible value that can occur in the array.
     * Assume the range of elements is from 0 to maxValue, inclusive.
     */
    public static void sort(Elem[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            // FILL IN CODE: access the key for arr[i] and increment the value in the corresponding "bin" in the counterArray

        }

        // Modify the counter array c[j] = c[j] + c[j-1]
        for (int j = 1; j < counterArray.length; j++) {
            // FILL IN CODE

        }

        Elem[] result = new Elem[arr.length];
        for (int k = arr.length - 1; k >= 0; k--) {
            // FILL IN CODE:
            // Iterate over the input array and using the counter array, place elements back into arr
            // Start by accessing the key for arr[k]; then look at the counterArray for the corresponding "bin"
            // You need to adjust the value in the counterArray and use that value to place arr[k] in the result array
            // Take arr[k], access it's key, go to that index in the counter array, decrement ..


        }

        // Copy elements from the array "result" back to arr
        // FILL IN CODE

    }

}
