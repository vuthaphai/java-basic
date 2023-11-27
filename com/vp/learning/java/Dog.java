package com.vp.learning.java;

public class Dog extends Animal {
    String name;

    void showInfo(){
        System.out.println("This is a dog");
    }


//    protected void eat() {
//        System.out.println("Dog eat dog's food");
//    }

    @Override
    void showName() {
//        super.showName();
        System.out.println("This dog is named "+ name);
    }

    void setName(String name) {
        this.name = name;
    }

    void eatAll(){
        super.eat();
        System.out.println("Eat called from supper class");
        this.eat();
    }
}
