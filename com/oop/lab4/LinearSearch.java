package com.oop.lab4;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        int key = inputKey(sc);

        printResult(array, key);
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

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void printResult(int[] array, int key) {
        if (linearSearch(array, key)) {
            System.out.println( key + " found at index : " + linearSearchIndex(array, key));
        } else {
            System.out.println(key + " not found");
        }
    }
}