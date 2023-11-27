package com.vp.abstraction;

public class AbstractPractiseDemo {
    public static void main(String[] args) {

//        Animal animal=new Animal(); //error

//        Animal animal = new Animal() {
//            @Override
//            public void makeSound() {
//                System.out.println("Ouk Ouk");
//            }
//        };

        Dog dog=new Dog();
        dog.eat();
        dog.makeSound();

        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();


    }
}
