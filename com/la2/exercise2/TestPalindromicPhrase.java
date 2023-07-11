package com.la2.exercise2;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner scanPhrase = new Scanner(System.in);
        System.out.print("Enter your phrase: ");
        String inputPhrase = "";
        inputPhrase += scanPhrase.nextLine().toUpperCase();
        String phraseResult = (testPalindromicPhrase(inputPhrase)) ? inputPhrase + " is a palindrome" : inputPhrase + " is not a palindrome";
        System.out.println(phraseResult);
    }
    public static boolean testPalindromicPhrase(String inputPhrase) {
        inputPhrase.trim();
        int length = inputPhrase.length();
        int fIdx = 0;
        int bIdx = length - 1;

        while (bIdx > fIdx) {
            if (!Character.isLetter(inputPhrase.charAt(fIdx))) {
                fIdx++;
                continue;
            } else if (!Character.isLetter(inputPhrase.charAt(bIdx))) {
                bIdx--;
                continue;
            } else {
                char forwardChar = inputPhrase.charAt(fIdx++);
                char backwardChar = inputPhrase.charAt(bIdx--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
