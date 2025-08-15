package org.multithreading.sorting.tasks;

import org.multithreading.sorting.interfaces.SortAlgorithm;

public class SortTask implements Runnable {

    private SortAlgorithm algorithm;
    private int[] array;
    private String name;

    public SortTask(SortAlgorithm algorithm, int[] array, String name) {
        this.algorithm = algorithm;
        this.array = array;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting " + this.name + " Sorting...");
        long start = System.currentTimeMillis();
        algorithm.sort(array);
        long end = System.currentTimeMillis();
        System.out.println(name + " sorting completed in " + (end - start) + "ms");
    }
}
