package com.vp.exeption;

import java.util.Arrays;

public class Exception {
    public static void main(String[] args) {
        System.out.println("First line");
        int a = 0;
        int b = 5;
        String[] name = {"Dara", "Thida"};
        try {
            System.out.println("Before result");
            int result = b/a;
            System.out.println("Result: " + result);

        }catch (ArithmeticException e) {
            System.out.println("Error occured: "+ e.getMessage());
        }finally {
            System.out.println("===End of result===");
        }

    }
}
