package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your test score: ");

        Scanner scan = new Scanner(System.in);


        int score = scan.nextInt();
        char grade = 'F';

        if (score > 89) {
            grade = 'A';
            System.out.println(grade);
        }else if (score > 79) {
            grade = 'B';
            System.out.println(grade);
        }else if (score > 69) {
            grade = 'C';
            System.out.println(grade);
        }else  if ( score > 59) {
            grade = 'D';
            System.out.println(grade);
        }
        else
            grade = 'F';
        System.out.println(grade);

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
    }
}
