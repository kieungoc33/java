package com.la2.exercise2;
import java.util.Scanner;
public class CountVowelsDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = sc.next().toLowerCase();
        sc.close();
        count(inputString);
    }
    public static void count(String inputString) {
        int vowelCount = 0;
        int digitCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c >= '0' && c <= '9') {
                digitCount++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        double vowelPercentage = (double) vowelCount / inputString.length() * 100;
        double digitPercentage = (double) digitCount / inputString.length() * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelCount, vowelPercentage);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitCount, digitPercentage);
        }
    }

