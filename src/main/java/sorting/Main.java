package sorting;

import java.util.Arrays;

import static sorting.ModifiedCountingSort.sort;
import static sorting.RadixSort.radixSort;

public class Main {
    public static void main(String[] args) {
        Elem[] records = {
                new Elem(6, "red"),
                new Elem(1, "blue"),
                new Elem(6, "yellow"),
                new Elem(2, "black"),
                new Elem(1, "brown"),
                new Elem(6, "orange"),
                new Elem(0, "green"),
                new Elem(6, "gray")};
        sort(records, 6);
        System.out.println(Arrays.toString(records));

        // Uncomment to test radix sort
        /*
        Elem[] elements = {
                new Elem(456, "A"), new Elem(308, "B"),
                new Elem(207, "C"), new Elem(405, "D"),
                new Elem(301, "E"), new Elem(123, "F"),
                new Elem(198, "E"), new Elem(883, "F"),

        };
        radixSort(elements);
        System.out.println(Arrays.toString(elements));
         */
    }

}
