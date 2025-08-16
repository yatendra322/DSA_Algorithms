package org.multithreading.main;

import org.multithreading.algorithms.comparisionBasedAlgo.*;
import org.multithreading.tasks.SortTask;
import org.multithreading.testDataGenerator.UniqueLongGenerator;
import org.multithreading.utils.LibraryMsg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SortingMain {
    public static void main(String[] args) {
        int[] arr1 = UniqueLongGenerator.getLongTypeArray();
        int[] arr2 = arr1.clone(); // So each algorithm gets the same input
        int[] arr3 = arr1.clone();
        int[] arr4 = arr1.clone();
        int[] arr5 = arr1.clone();
        int[] arr6 = arr1.clone();
        int[] arr7 = arr1.clone();
        //System.out.println("arr1: " + Arrays.toString(arr1));
        try {


            ExecutorService executorService = Executors.newCachedThreadPool();

            executorService.execute(new SortTask(new BubbleSort(), arr1, "BubbleSort"));
            executorService.execute(new SortTask(new InsertionSort(), arr2, "InsertionSort"));
            executorService.execute(new SortTask(new MergeSort(), arr3, "MergeSort"));
            executorService.execute(new SortTask(new QuikSort(), arr4, "QuickSort"));
            executorService.execute(new SortTask(new SelectionSort(), arr5, "SelectionSort"));
            //executorService.execute(new SortTask(new CountingSort(), arr6, "CountSort"));
            executorService.execute(new SortTask(new HeapSort(), arr7, "HeapSort"));


            executorService.shutdown();

            try {
                if (executorService.awaitTermination(1, TimeUnit.MINUTES)) LibraryMsg.showLog();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


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
