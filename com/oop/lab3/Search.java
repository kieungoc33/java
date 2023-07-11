package com.oop.lab3;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the search key: ");
        int key = sc.nextInt();


        int index = search(array, key);
        if (index != -1) {
            System.out.printf("The key %d was found at index %d\n", key, index);
        } else {
            System.out.printf("The key %d was not found\n", key);
        }
    }
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

}

