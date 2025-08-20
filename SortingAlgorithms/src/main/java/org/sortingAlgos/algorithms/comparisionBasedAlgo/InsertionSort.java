package org.sortingAlgos.algorithms.comparisionBasedAlgo;

import org.sortingAlgos.interfaces.SortAlgorithm;

public class InsertionSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
