package com.la2.exercise1;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        triangularPatternA(size);
        System.out.println("  (a)  ");
        triangularPatterB(size);
        System.out.println("  (b) ");
        triangularPatternC(size);
        System.out.println("  (c)  ");
        triangularPatternD(size);
        System.out.println("  (d)  ");

    }

    public static void triangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatterB(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }

    public static void triangularPatternC(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void triangularPatternD(int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row < col) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
