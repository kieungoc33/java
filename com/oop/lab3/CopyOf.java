package com.oop.lab3;
import java.util.Scanner;
import java.util.Arrays;
public class CopyOf {
    public static int[] copyOf(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = Arrays.copyOf(array, newLength);
        if (newLength > array.length) {
            Arrays.fill(newArray, array.length, newLength, 0);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] copy = copyOf(array);
        System.out.println(Arrays.toString(copy)); // prints "[1, 2, 3, 4, 5]"

        int[] copyWithLength = copyOf(array, 8);
        System.out.println(Arrays.toString(copyWithLength)); // prints "[1, 2, 3, 4, 5, 0, 0, 0]"

        int[] copyWithShorterLength = copyOf(array, 3);
        System.out.println(Arrays.toString(copyWithShorterLength));
    }
}
