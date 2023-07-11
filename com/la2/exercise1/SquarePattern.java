package com.la2.exercise1;
import java.util.Scanner;
public class SquarePattern {

    public static void main (String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Print Square Using For Loop: ");
        printSquareUsingForLoop(size);
        System.out.println("Print Square Using While -do Loop: ");
        printSquareUsingWhileDoLoop(size);


    }
    public static void printSquareUsingForLoop(int size){
        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void printSquareUsingWhileDoLoop(int size){
        int row = 1;
        int col = 1;

        while (row <= size) {
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            col = 1;
            row++;
            System.out.println();
        }
    }
}
