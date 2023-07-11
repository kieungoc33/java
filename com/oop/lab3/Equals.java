package com.oop.lab3;

import java.util.Scanner;
public class Equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();


        System.out.println("Enter the elements of the first array: ");
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        if (equals(array1, array2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }

}

