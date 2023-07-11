package com.la2.exercise2;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String input = in.next().toUpperCase();
        convertCode(input);
    }
    public static void convertCode(String input){

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'W') {
                c = (char) (c + 3);
            } else if (c >= 'X' && c <= 'Z') {
                c = (char) (c - 23);
            }
            result += c;
        }
        System.out.println("The ciphertext string is: " + result);
    }
}
