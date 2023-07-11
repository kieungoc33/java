package com.la2.exercise2;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalString = input.next();
        convertString(octalString);

    }
    public static void convertString(String octalString){
        int decimal = 0;
        for (int i = 0; i < octalString.length(); i++) {
            char digit = octalString.charAt(i);
            int value = Character.getNumericValue(digit);
            decimal = decimal * 8 + value;
        }

        System.out.println("The equivalent decimal number \"" + octalString + "\" is: " + decimal);
    }
}

