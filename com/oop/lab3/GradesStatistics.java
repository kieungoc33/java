package com.oop.lab3;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        studentGrades(grades);
    }
        public static void studentGrades( int[] grades){
            int sum = 0;
            int min = grades[0];
            int max = grades[0];

            for (int grade : grades) {
                sum += grade;
                if (grade < min) {
                    min = grade;
                }
                if (grade > max) {
                    max = grade;
                }
            }

            double average = (double) sum / grades.length;

            System.out.printf("The average is: %.2f\n", average);
            System.out.println("The minimum is: " + min);
            System.out.println("The maximum is: " + max);

        }
    }

