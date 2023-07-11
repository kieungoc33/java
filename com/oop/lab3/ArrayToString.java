package com.oop.lab3;
import java.util.Scanner;
public class ArrayToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        if (arrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (array.length > 0) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = sc.nextInt();
                }
            }

            System.out.println(arrayToString(array));
        }
    }
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
