package com.vp.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        //cannot create object from abstract class
//        Language language = new Language();
        KhmerLanguage khmerLanguage = new KhmerLanguage();
//        khmerLanguage.display();
//        khmerLanguage.info();
        khmerLanguage.sayGreating();

        ThaiLanguage thaiLanguage = new ThaiLanguage();

        thaiLanguage.sayGreating();


    }
}
