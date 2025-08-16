package org.multithreading.algorithms.nonComparisonBasedAlgo;

import org.multithreading.interfaces.SortAlgorithm;

public class CountingSort implements SortAlgorithm {

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        int[] count = new int[maxValue + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= maxValue; i++) {
            count[i] += count[i - 1];
        }

        int ans[] = new int[n];
        for (int i = n - 1; i >= 0; ++i) {
            ans[count[arr[i]] - 1] = count[i];

        }
    }

    @Override
    public int[] sort(int[] arr) {
        countingSort(arr);
        return arr;
    }
}
