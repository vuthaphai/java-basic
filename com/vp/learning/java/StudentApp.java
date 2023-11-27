package com.vp.learning.java;

import com.vp.access.modify.Test;

public class StudentApp {
    public static void main(String[] args) {
        Student01 student01 = new Student01();
        student01.setAge(37);
//        System.out.println(student.toData());

        Test t = new Test();
        t.name = "Vutha";
        System.out.println(t.toData());
    }
}
