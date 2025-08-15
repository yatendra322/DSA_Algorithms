package org.multithreading.sorting.algorithms;

import org.multithreading.sorting.interfaces.SortAlgorithm;

public class HeapSort implements SortAlgorithm {

        public static void heapSort(int[]arr,int i)
        {
            int n = arr.length;
            int large=i;
            int left=2*i+1;
            int right=2*i+2;

            if(left<n && arr[left]<arr[large]) {
                large = left;
            }

            if(right<n && arr[right]<arr[large]) {
                large = right;
            }

            if(large != i){
                int temp=arr[i];
                arr[i]=arr[large];
                arr[large]=temp;
            }

            heapSort(arr, large);
        }



    @Override
    public void sort(int[] arr) {
        //heapSort(arr);
    }

}
