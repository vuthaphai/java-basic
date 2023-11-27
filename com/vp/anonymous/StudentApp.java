package com.vp.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Virak", 35),
                new Student("Thida", 20),
                new Student("Lisa", 25),
                new Student("Phara", 26)
        };

        for (Student st : students) {
            System.out.println(st);
        }

        System.out.println("========================");

//        Arrays.sort(students, new SortByAge());

        Comparator<Student> sortByname = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(students, sortByname);

        for (Student st : students) {
            System.out.println(st);
        }

    }
}
