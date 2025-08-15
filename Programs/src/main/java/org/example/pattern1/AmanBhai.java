package org.example.pattern1;

import java.util.Scanner;

public class AmanBhai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of boxes");
        int box = scanner.nextInt();
        for (int n = box; n > 0; n--) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n * 4; j++) {
                    if (i == 0 || j == 0 || i == 3 || j == n || j == (n * 4 - 1)) {
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
