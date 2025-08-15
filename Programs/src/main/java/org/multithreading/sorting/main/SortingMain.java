package org.multithreading.sorting.main;

import org.multithreading.sorting.algorithms.*;
import org.multithreading.sorting.tasks.SortTask;
import org.multithreading.sorting.testDataGenerator.UniqueLongGenerator;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr1 = UniqueLongGenerator.getLongTypeArray();
        int[] arr2 = arr1.clone(); // So each algorithm gets the same input
        int[] arr3 = arr1.clone();
        int[] arr4 = arr1.clone();
        int[] arr5 = arr1.clone();
        int[] arr6 = arr1.clone();
        System.out.println("arr1: " + Arrays.toString(arr1));
        try {


            ExecutorService executorService = Executors.newCachedThreadPool();

            executorService.execute(new SortTask(new BubbleSort(), arr1, "BubbleSort"));
            executorService.execute(new SortTask(new InsertionSort(), arr2, "InsertionSort"));
            executorService.execute(new SortTask(new MergeSort(), arr3, "MergeSort"));
            executorService.execute(new SortTask(new QuikSort(), arr4, "QuickSort"));
            executorService.execute(new SortTask(new SelectionSort(), arr5, "SelectionSort"));

            executorService.close();




            //executorService.execute(new SortTask(new CountingSort(), arr6, "CountingSort"));
            //executorService.execute(new SortTask(new HeapSort(), arr6, "HeapSort"));

            /*Thread bubbleThread = new Thread(new SortTask(new BubbleSort(), arr1, "BubbleSort"));
            Thread insertionThread = new Thread(new SortTask(new InsertionSort(), arr2, "InsertionSort"));
            Thread mergeThread = new Thread(new SortTask(new MergeSort(), arr3, "MergeSort"));
            Thread quickThread = new Thread(new SortTask(new QuikSort(), arr4, "QuickSort"));
            Thread selectionThread = new Thread(new SortTask(new SelectionSort(), arr5, "SelectionSort"));
            Thread countThread = new Thread(new SortTask(new CountingSort(), arr6, "CountSort"));//y
            Thread heapThread = new Thread(new SortTask(new HeapSort(), arr1, "HeapSort"));

            bubbleThread.start();
            insertionThread.start();
            mergeThread.start();
            quickThread.start();
            selectionThread.start();
            countThread.start();
            heapThread.start();

            bubbleThread.join();
            insertionThread.join();
            mergeThread.join();
            quickThread.join();
            selectionThread.join();
            countThread.join();
            heapThread.join();*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
