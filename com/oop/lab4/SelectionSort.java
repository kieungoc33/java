package com.oop.lab4;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []array = inputArray(sc);
        selectionSort(array);
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
        System.out.println("Selection Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element of the unsorted array
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
