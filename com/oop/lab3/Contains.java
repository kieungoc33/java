package com.oop.lab3;

import java.util.Scanner;

public class Contains {
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search for: ");
        int key = sc.nextInt();
        if (contains(array, key)) {
            System.out.println("The array contains the key");
        } else {
            System.out.println("The array doesn't contain the key");
        }
    }
}

