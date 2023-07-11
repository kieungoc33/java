package com.oop.lab4;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = inputArray(sc);
        bubbleSort(array);
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
        System.out.println("Bubble Sort :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}

