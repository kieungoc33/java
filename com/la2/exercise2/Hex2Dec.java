package com.la2.exercise2;

import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String input = scan.next();
        scan.close();
        result(input);
    }

    public static void result(String input) {
        try {
            int hexa = Integer.parseInt(input, 16);
            System.out.println("The equivalent decimal number for hexadecimal \"" + input + "\" is: " + hexa);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string \"" + input + "\"");
        }
    }
}