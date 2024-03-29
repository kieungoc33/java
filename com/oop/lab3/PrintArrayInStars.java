package com.oop.lab3;
import java.util.Scanner;
public class PrintArrayInStars {
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
        }
        printArrayInStars(items);
    }
    public static void printArrayInStars(int[] items){
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= items[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" (" + items[i] + ")\n");
        }
    }

}
