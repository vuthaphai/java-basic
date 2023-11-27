package com.vp.inheritance;

public class Teacher extends Person {
    private double salary;
    private String nationality;
    final int HOUR = 50;

    public Teacher(){
        super("Thida", "Femal", 30);
        this.salary = 150;
//        this.hour =30;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
//        super.showInfo();
        System.out.println("From teacher class");
    }


}

