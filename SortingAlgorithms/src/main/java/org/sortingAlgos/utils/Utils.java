package org.sortingAlgos.utils;

public class Utils {
    public static String isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return "FAIL"; // not sorted
            }
        }
        return "DONE"; // sorted
    }
}
