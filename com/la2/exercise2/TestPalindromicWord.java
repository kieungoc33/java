package com.la2.exercise2;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();
        run(word);
    }
    public static void run(String word){
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }

}
