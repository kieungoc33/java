package com.oop.lab3;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        final int SENTINEL = -1;
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }

        System.out.println("The magic sum is: " + sum);
    }
    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

