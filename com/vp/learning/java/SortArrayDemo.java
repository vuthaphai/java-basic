package com.vp.learning.java;

import java.util.Arrays;

public class SortArrayDemo {
    public static void main(String[] args) {
        //Sorting
        int a[] = new int[] {50,40,23,90,21,45};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
