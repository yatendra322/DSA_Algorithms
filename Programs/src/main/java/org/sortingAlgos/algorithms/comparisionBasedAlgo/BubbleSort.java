package org.sortingAlgos.algorithms.comparisionBasedAlgo;

import org.sortingAlgos.interfaces.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {

        int i, j, temp;
        boolean flag;
        int n = arr.length;

        for (i = 0; i < n - 1; i++) {
            flag = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;

        }
        return arr;
    }

}
