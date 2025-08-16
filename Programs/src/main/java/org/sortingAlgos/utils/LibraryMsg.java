package org.sortingAlgos.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryMsg {
    public static String lineStr = "|----------------------||-------------||------|";
    static List<String> logs = Collections.synchronizedList(new ArrayList<>());

    public static void updateLog(String algoName, long startTime, long endTime, String sucesse) {
        long totalTime = endTime - startTime;
        logs.add(formatLog(algoName, totalTime, sucesse));
    }

    private static String formatLog(String algoName, long totalTime, String task) {
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";

        // choose color based on task
        String coloredTask;
        if ("Done".equalsIgnoreCase(task)) {
            coloredTask = GREEN + task + RESET;
        } else if ("Fail".equalsIgnoreCase(task)) {
            coloredTask = RED + task + RESET;
        } else {
            coloredTask = task; // default no color
        }
        String msg = String.format(lineStr + "\n" +
                "| %-20s ||    %8d || %-8s |", algoName, totalTime, coloredTask);
        return msg;
    }

    public static void showLog() {
        System.out.println(lineStr);
        System.out.println("|     === Summary of All Algorithms ===       |");
        System.out.println(lineStr);
        System.out.println("| Algorithm            ||Total Time ms||Status|");
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println(lineStr);
    }


}
