package com.oop.lab3;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer Array");
        System.out.print("Enter the length of array: ");
        int intArrayLength = Integer.parseInt(scan.next());
        int[] intArray = new int[intArrayLength];

        if (intArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (intArray.length > 0) {
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = Integer.parseInt(scan.next());
                }
            }
            print(intArray);
        }

        System.out.println("Double Array");
        System.out.print("Enter the length of array: ");
        int doubleArrayLength = Integer.parseInt(scan.next());
        double[] doubleArray = new double[doubleArrayLength];

        if (doubleArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (doubleArray.length > 0) {
                for (int i = 0; i < doubleArray.length; i++) {
                    doubleArray[i] = Double.parseDouble(scan.next());
                }
            }
            print(doubleArray);
        }

        System.out.println("Float Array");
        System.out.print("Enter the length of array: ");
        int floatArrayLength = Integer.parseInt(scan.next());
        float[] floatArray = new float[floatArrayLength];

        if (floatArrayLength == 0) {
            System.out.println("The values: []");
        } else {
            System.out.print("Enter the value of all elements (separated by space): ");
            if (floatArray.length > 0) {
                for (int i = 0; i < floatArray.length; i++) {
                    floatArray[i] = Float.parseFloat(scan.next());
                }
            }
            print(floatArray);
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}