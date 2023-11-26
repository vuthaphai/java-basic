package com.vp.learning.java;

public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(37);
        System.out.println(student.toData());
    }
}
