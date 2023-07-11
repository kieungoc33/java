package com.oop.lab4;

import java.util.Scanner;

public class BinarySearch {

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) { // Terminating one-element list
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false; // not found
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                return binarySearch(array, key, fromIdx, middleIdx);
            } else {
                return binarySearch(array, key, middleIdx + 1, toIdx);
            }
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        System.out.print("Enter array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static int inputKey(Scanner sc) {
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        return key;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] array = inputArray(sc);
        int key = inputKey(sc);
        boolean found = binarySearch(array, key);
        System.out.println(found);
    }
}

