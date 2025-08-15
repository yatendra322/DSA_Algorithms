package org.multithreading.sorting.algorithms;

import org.multithreading.sorting.interfaces.SortAlgorithm;

import java.util.Arrays;

public class SelectionSort implements SortAlgorithm {


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {

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
    public void sort(int[] arr) {
        selectionSort(arr);
        System.out.println("arr: " + Arrays.toString(arr));
    }
}
