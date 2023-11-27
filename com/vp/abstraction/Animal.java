package com.vp.abstraction;

public abstract class Animal {
    protected String name;
    protected int age;

    public void eat(){
        System.out.println("Animal can eat their food");
    }

    public abstract void makeSound();

}
