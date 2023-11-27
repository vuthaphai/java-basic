package com.vp.learning.java;

public class Student01 {
    protected String name;
    private String gender;
    private int age;

    protected String toData(){
        return String.format("Name:%s | Gener:%s | Age:%d ", name, gender, age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0) {
            this.age = age;
        }

    }
}
