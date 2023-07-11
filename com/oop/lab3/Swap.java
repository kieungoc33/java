package com.oop.lab3;
import java.util.Scanner;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array1: ");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];

        System.out.print("Enter the elements of array1: ");
        for (int i = 0; i < length1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the length of array2: ");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];

        System.out.print("Enter the elements of array2: ");
        for (int i = 0; i < length2; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean success = swap(array1, array2);

        if (success) {
            System.out.println("Arrays have been successfully swapped.");
            System.out.println("array1 = " + Arrays.toString(array1));
            System.out.println("array2 = " + Arrays.toString(array2));
        } else {
            System.out.println("Arrays have different lengths and cannot be swapped.");
        }

        scanner.close();
    }

    public static boolean swap(int[] array1, int[] array2) {
        // check if arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // swap the contents of the arrays
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }
}
