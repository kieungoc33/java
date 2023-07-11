package com.la2.exercise2;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexString = input.nextLine();
        checkHexStr(hexString);
    }

    public static void checkHexStr(String hexString){
        boolean isValidHex = true;
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                isValidHex = false;
                break;
            }
        }

        if (isValidHex) {
            System.out.println("\"" + hexString + "\" is a hex string");
        } else {
            System.out.println(hexString + "\" is NOT a hex string");
        }
    }

}
