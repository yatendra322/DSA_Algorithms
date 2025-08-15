package org.multithreading.sorting.testDataGenerator;

import java.util.*;

public class UniqueLongGenerator {
    public static int[] getLongTypeArray() {
        Set<Integer> uniqueNumbers = new HashSet<>(1_000_000);
        Random random = new Random();

        while (uniqueNumbers.size() < 1_000_000) { // Changed here
            int number = random.nextInt() & Integer.MAX_VALUE; // ensure positive
            uniqueNumbers.add(number);
        }

        List<Integer> resultList = new ArrayList<>(uniqueNumbers);
        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
