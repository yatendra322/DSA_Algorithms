package org.sortingAlgos.tasks;

import org.sortingAlgos.interfaces.SortAlgorithm;
import org.sortingAlgos.utils.LibraryMsg;
import org.sortingAlgos.utils.Utils;

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
        int sortedArr[] = algorithm.sort(array);
        long end = System.currentTimeMillis();
        LibraryMsg.updateLog(name,start,end,Utils.isSortedAscending(sortedArr));
    }
}
