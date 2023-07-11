package com.la2.exercise1;
import java.util.Scanner;
public class BoxPattern {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        boxPatternA(size);
        System.out.println("  (a)  ");
        boxPatternB(size);
        System.out.println("   (b)  ");
        boxPatternC(size);
        System.out.println("   (c)  ");
        boxPatternD(size);
        System.out.println("   (d)  ");

    }
    public static void boxPatternA(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row%size <= 1) || (col % size <= 1) ) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void boxPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row%size <= 1) || (row == col) ) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void boxPatternC(int size){
        for (int row = 1; row <= size; row++)
        {
            for (int col = 1; col <= size; col++)
            {
                if((row % size <= 1) || (row + col == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void boxPatternD(int size){
        for (int row = 1; row <= size; row++)
        {
            for (int col = 1; col <= size; col++)
            {
                if((row%size <= 1) || (row == col) || (row + col == size + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
