package com.vp.inheritance;

public class Student extends Person {
    private String grade;

    public Student(){
        super("Vutha", "Male", 37);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
