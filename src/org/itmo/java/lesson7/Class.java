package org.itmo.java.lesson7;

public class Class {
    static void firstMethod(){
        System.out.println("firstMethod was called");
    }
    static class NewClass{
        public String name;
         void staticMethod(){
            System.out.println("staticMethod was called");

        }
    }

    public static void main(String[] args) {
        Class.NewClass newClass = new Class.NewClass();
        newClass.staticMethod();
    }
}
