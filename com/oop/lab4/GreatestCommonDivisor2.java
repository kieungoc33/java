package com.oop.lab4;
import java.util.Scanner;
public class GreatestCommonDivisor2 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        // Ensure a is greater than or equal to b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a : ");
        int a = sc.nextInt();
        System.out.println(" Enter b: ");
        int b = sc.nextInt();
        System.out.println("the Euclid algorithm to find the GCD of " + a + " and " + b + " : "+ gcd(a,b) );




    }

}
