package com.vp.learning.java;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        String text = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Word-" + (i+1) + ": ");
            String word = scanner.next();
            text += word + " ";
        }

        System.out.println("Here is your text: "+ text);
    }
}
