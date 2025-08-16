package org.multithreading.algorithms.comparisionBasedAlgo;

import org.multithreading.interfaces.SortAlgorithm;

public class SelectionSort implements SortAlgorithm {


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    @Override
    public int[] sort(int[] arr) {
        selectionSort(arr);
        return arr;
    }
}
