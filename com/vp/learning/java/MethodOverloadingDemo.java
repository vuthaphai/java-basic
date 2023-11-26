package com.vp.learning.java;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        print("Welcome to Cambodia");
        print(23);
        print("Amount: ", 500);

//        int[] a = new int[] { 34,67,54,56};
//        print(a);
//        printNumber(21,34,67,54,56,768);
        display("Coco", 23,23,45,66,73,89);
    }

    public static void display(String name, double... price){
        System.out.print(name + ": ");
        for(double n: price){
            System.out.print(n+",");
        }
    }
    public static void printNumber(int...number){
        for(int n: number){
            System.out.println(n);
        }
    }


    public static void print(int[] number){
        for (int n: number ) {
            System.out.println(n);
        }
    }

    public static void print(String property, int value){
        System.out.println(property  + value);
    }

    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int number){
        System.out.println(number);
    }


}
