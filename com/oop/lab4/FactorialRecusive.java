package com.oop.lab4;

public class FactorialRecusive {
    public static void main(String[]args){
        int n = 5;
        System.out.println("Recursive version is :" +recursiveFactorial(n));
        System.out.println("Iterative version is : " +iterativeFactorial(n) );


    }
    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1; // base case
        } else {
            return n * recursiveFactorial(n-1); // call itself
        }
    }
    public static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
