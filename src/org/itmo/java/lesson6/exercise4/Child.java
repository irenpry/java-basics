package org.itmo.java.lesson6.exercise4;

public class Child extends Parent {
    public Child(int number) {
        super(number);
    }

    public void printNumber() {
        System.out.println(this.getNumber());
    }
}
