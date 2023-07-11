package com.oop.lab4;
import java.util.Scanner;
public class PerfectandDeficientNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        int perfectCount = 0;
        int deficientCount = 0;
        System.out.println("These numbers are perfect:");
        for (int i = 2; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                perfectCount++;
            }
        }
        System.out.println("\n" +"[ "+ perfectCount + " perfect numbers found (" + ((double)perfectCount/upperBound)*100 + "%) ]");
        System.out.println("\n"+"These numbers are neither deficient nor perfect:");
        for (int i = 2; i <= upperBound; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                deficientCount++;
            }
        }
        System.out.println("\n" +" [ "+ deficientCount + " numbers found (" + ((double)deficientCount/upperBound)*100 + "%) ]");
    }
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        return sum < aPosInt;
    }


}
