package com.la2.exercise2;
import java.util.Scanner;
public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your radix: ");
        int radix = Integer.parseInt(scan.next());
        System.out.print("Enter your string: ");
        String input = scan.next();
        scan.close();
        ressult(radix, input);
    }

    public static void ressult(int radix, String input) {
        try {
            int result = Integer.parseInt(input, radix);
            System.out.println("The equivalent decimal number \"" + input + "\" is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid string \"" + input + "\"");
        }
    }
}
