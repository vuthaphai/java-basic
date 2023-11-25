package com.vp.learning.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        String[] name = new String[5];
        float[] score = new float[10];

//        int[] a = {2,4, 7,20,3,22};
        int[] a = new int[] {2,4, 7,20,3,22};

//        System.out.println(Arrays.toString(a));

        int[] b = new int[5];
//        String[] b = new String[5];
//        double[] b = new double[5];
        b[0] = 25;
        b[1] = 43;
        b[2] = 23;
        b[3] = 12;
        b[4] = 15;

//        System.out.println(Arrays.toString(b));
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }

        int sum=0;

        for (int item: b) {
            sum += item;
        }
        System.out.println(sum);

//        String[] names = new String[] {"Vutha", "Vp","Seyma", "Sokcheng"};
//        for (String item :
//                names) {
//            System.out.println(item);
//
//        }





    }
}
