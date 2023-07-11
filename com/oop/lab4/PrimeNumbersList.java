package com.oop.lab4;

import java.util.Scanner;
public class PrimeNumbersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperBound = getUpperBound(sc);


        printPrime(upperBound);
    }

    public static int getUpperBound(Scanner sc) {
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        return upperBound;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int upperBound) {
        int primeCount = 0;
        for (int i = 1; i < upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
        }
        double primePer = (double) primeCount / upperBound * 100.0;
        System.out.printf("[%d primes found (%.2f%%)]", primeCount, primePer);
    }
}
