package com.vp.anonymous;

public class AnonymousClassDemo {

    Shape shape1 = new Shape(){
        public void draw() {
            System.out.println("Drawing something...");
        }
    };

    void test(){
        shape1.draw();
    }

    static Polygon polygon = new Polygon() {
        @Override
        public void info() {
            System.out.println("My interface");
            t();
        }

        public void t(){
            System.out.println("test");
        }
    };

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
//        AnonymousClassDemo anonymousClassDemo = new AnonymousClassDemo();
//        anonymousClassDemo.test();

        polygon.info();
    }
}
