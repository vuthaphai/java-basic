package com.vp.abstraction;

public abstract class Language {
    protected int year;

    public Language(){
        this(1250);
    }

    public Language(int year){
        this.year =year;
    }

    abstract void display();
    abstract void sayGreating();//Say Hello

    void info(){
//        System.out.println("This is the Language class");
        System.out.println("This Language was invented in " + year);
    }
}
