package com.oop.lab4;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        insertionSort(array);
        printArray(array);
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

    public static void printArray(int[] array) {
        System.out.println("Insertion Sort :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

