package org.multithreading.sorting.main;

import org.multithreading.sorting.algorithms.BubbleSort;
import org.multithreading.sorting.tasks.SortTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskManager {

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();

        //executorService.execute(new SortTask(new BubbleSort(), arr1, "BubbleSort"));

    }

}
