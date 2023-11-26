package com.vp.learning.java;

public class Car {
    String color;
    int numberOfWheel;
    double price;
    boolean isDriving;

    void drive1(){
        System.out.println("Car drive");
    }

    void info1(){
        System.out.print("Info1: ");
        System.out.println("Color: "+ color + " | Number of wheel: "+ numberOfWheel + " | Price: "+ price );
    }
    void info2(){
        System.out.print("Info2: ");
        System.out.println("Color:%s | Number of wheel:%d | Price:%f ".formatted(color,numberOfWheel,price) );
    }
     void info3(){
         System.out.print("Info3: ");
        System.out.println(String.format("Color:%s | Number of wheel:%d | Price:%f ", color,numberOfWheel,price ));
    }

    void drive() {
        isDriving = true;
    }
    void stop() {
        isDriving = false;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.numberOfWheel = 4;
        car.price = 25000;
//        car.info1();
//        car.info2();
//        car.info3();
//        car.drive1();

        System.out.println(car.isDriving);
        car.drive();
        System.out.println(car.isDriving);
        car.stop();
        System.out.println(car.isDriving);

    }
}
