package com.la2.exercise1;
import java.util.Scanner;
public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        hillPatternA(size);
        System.out.println("  (a)  ");
        hillPatternB(size);
        System.out.println("  (b)  ");
        hillPatternC(size);
        System.out.println("  (c)  ");
        hillPatternD(size);
        System.out.println("  (D)  ");

    }

    public static void hillPatternA(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= 2 * size - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col || row == size - col + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void hillPatternC(int size) {
        int n = 0;
        while (n <= 2 * size) {
            int row = Math.abs(size - n);
            if (row == 0) {
                n += 2;
                continue;
            }
            for (int col = 1; col <= 2 * size - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
            n++;
        }
    }

    public static void hillPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % size <= 1) ||
                        (col % size <= 1) ||
                        (row == col) ||
                        (row + col == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
