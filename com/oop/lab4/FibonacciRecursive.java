package com.oop.lab4;
import java.util.Scanner;
public class FibonacciRecursive {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap n ");
        int n = sc.nextInt();
        System.out.println("Recursive method to compute the Fibonacci number of " + n + " is " + fibonacci(n));

    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}
