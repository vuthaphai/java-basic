package com.vp.abstraction;

public class KhmerLanguage extends Language{

    public KhmerLanguage(){
        super(1992);
    }

//    abstract void hello();

    @Override
    void display() {
        System.out.println("This is Khmer Language class");
    }

    @Override
    void sayGreating() {
        System.out.println("Khmer say chum reab suo!!");
    }
}
