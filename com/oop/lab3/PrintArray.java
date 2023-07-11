package com.oop.lab3;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items =  new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space) : ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = sc.nextInt();
            }
            printArray(items);
        }
}
    public static void printArray( int [] items){
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("The values are: [" + items[i]);
            } else if (i == items.length - 1) {
                System.out.print(", " + items[i] + "]");
            } else {
                System.out.print(", " + items[i]);
            }
        }
    }
}
