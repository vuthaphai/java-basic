package com.vp.access.modify;

import com.vp.learning.java.Student;

public class Test extends Student{
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "dara";
        Test t= new Test();
        t.name = "Vutha";
        System.out.println(t.toData());
    }

}
