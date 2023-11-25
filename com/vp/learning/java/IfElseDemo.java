package com.vp.learning.java;

public class IfElseDemo {
    public static void main(String[] args) {
       //score:80

        /*
         * Condition:
         * score >=90 => 'A'
         * score >=80 => 'B'
         * score >=70 => 'C'
         * score >=60 => 'D'
         * score >=50 => 'E'
         * score <50 => 'F'
         */

        float score = 99;
        char grade ='F';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        }else {
            grade = 'F';
        }

        System.out.println("Your grade is "+ grade);
    }
}
