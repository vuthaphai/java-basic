package com.vp.statickey;

public class StaticKeywordDemo {
    public static void main(String[] args) {
//        Student student1 = new Student("Vutha", "male", 12);
//        Student student2 = new Student("Vp", "male", 11);

//        student1.setName("Dary");
        Student.numberOfStudent = 30;
        Student.print();
    }
}
