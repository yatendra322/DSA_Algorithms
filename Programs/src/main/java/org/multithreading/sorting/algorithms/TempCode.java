package org.multithreading.sorting.algorithms;

import java.util.Arrays;

public class TempCode {

    public static void main(String[] args) {
        int[] arr = {20, 2, 9, 7, 12, 15, 1, 6, 8};
        System.out.println("Before -> " + Arrays.toString(arr));
        int pivot = arr[arr.length - 1];
        int pivotIndex = arr.length - 1;
        int i = -1;
        int j = 0;
        quickSort(arr,i,j,pivot,pivotIndex);
        System.out.println("After -> " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int i, int j, int pivot, int pivotIndex) {
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > pivot) {
                j++;
            } else if (arr[k] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            } else if (j == pivotIndex) {
                i++;
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;

            }
            System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", pivotIndex = " + pivotIndex + "  ----->  "+Arrays.toString(arr));
        }

        quickSort(arr,-1,0,arr[i-1], i-1);
        quickSort(arr,i-1,i,arr[j], j);


    }

}
