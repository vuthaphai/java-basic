package com.vp.statickey;

public class Student {
    private String name;
    private String gender;
    private int grade;

    static int numberOfStudent ;

    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Person [name: " + name + " | gender: " + gender + " | grade: " + grade + " | Number of student: "+ numberOfStudent + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public static void setNumberOfStudent(int numberOfStudent) {
        Student.numberOfStudent = numberOfStudent;
    }

    public static void print(){
        System.out.println("Number of student: "+ numberOfStudent);
    }
}
