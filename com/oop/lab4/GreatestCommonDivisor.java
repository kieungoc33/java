package com.oop.lab4;
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter number a :");
        int a = sc.nextInt();
        System.out.println(" Enter number b :");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b +" is : " + gcd(a,b));

    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
