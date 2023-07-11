package com.oop.lab4;

public class LengthRunningNumberSequence {
    public static void main(String[]args){
        for (int i = 1; i <= 12 ; i++) {
            System.out.println(" S(" + i + ") length is " + len_S(i));
        }

    }
    public static int len_S(int n) {
        if (n == 1) {
            return 1;
        }
        return len_S(n - 1) + String.valueOf(n).length();
    }

}
