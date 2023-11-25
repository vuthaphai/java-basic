package com.vp.learning.java;

public class ArrayDemo2 {
    public static void main(String[] args) {
//        findEverage();
//        findMaximum();
        checkNummberExistOrNot();
    }

    private static void checkNummberExistOrNot() {
        int[] a = new int[] { 50,60,70,80,69,65, 99};
        int number2Find = 70;
        int index = -1;
        for(int i=0;i<a.length;i++){
            if (number2Find == a[i]) {
                index =i;
            }
        }

        if (index != -1) {
            System.out.println("Number exist");
        }else {
            System.out.println("Number not exist");
        }
    }

    private static void findMaximum() {
        int[] a = new int[] { 50,60,70,80,69,65, 99};

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println("Maximum is " + max);

        
    }

    private static void findEverage() {
//        System.out.println("average");
        int[] a = new int[] { 50,60,70,80,69,65};
        int numberElement = a.length;
        int total = 0;

        for (int n : a) {
            total+=n;
        }

        float avg = (float) total/numberElement;
        System.out.println("avg: "+ avg);
        
    }
}
