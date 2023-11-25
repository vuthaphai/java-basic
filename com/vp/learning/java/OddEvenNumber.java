package com.vp.learning.java;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = scanner.nextInt();

        int remainer = number%2;

        if (remainer==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
