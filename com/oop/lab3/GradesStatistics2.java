package com.oop.lab3;

import java.util.*;

public class GradesStatistics2 {

    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f\n", stdDev(grades));
    }

    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            int grade = scanner.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.print("Invalid grade, please enter a grade between 0 and 100: ");
                grade = scanner.nextInt();
            }
            grades[i] = grade;
        }
    }

    public static void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int grade : array) {
            sum += grade;
        }
        return sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[middle-1] + array[middle]) / 2.0;
        } else {
            return array[middle];
        }
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double stdDev(int[] array) {
        double mean = average(array);
        double sum = 0;
        for (int grade : array) {
            sum += Math.pow(grade - mean, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }

}
