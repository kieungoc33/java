package com.oop.lab3;
import java.util.Scanner;
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int input = sc.nextInt();

        String result = dec2Hex(input);
        System.out.print("The equivalent hexadecimal number is: " + result);
    }

    public static String dec2Hex(int input) {
        return Integer.toHexString(input).toUpperCase();
    }
}