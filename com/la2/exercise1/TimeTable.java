package com.la2.exercise1;
import java.util.Scanner;
public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        printMultiplicationTable(size);
    }

    public static void printMultiplicationTable(int size) {
        for (int row = 0; row <= size + 1; row++) {
            for (int col = 0; col <= size; col++) {
                if (col == 0 && row == 0) {
                    System.out.printf("%4s |", "*");
                }
                if (row == 0 && col > 0) {
                    System.out.printf("%4d", col);
                }
                if (row == 1) {
                    System.out.printf("%4s", "---");
                }
                if (col == 0 && row > 1) {
                    System.out.printf("%4d |", row - 1);
                }
                if (row > 1 && col != 0) {
                    System.out.printf("%4d", (row - 1) * col);
                }
            }
            System.out.println();
        }
    }
}
