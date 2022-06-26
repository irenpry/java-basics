package org.itmo.java.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.summ(5,6));
        System.out.println(Calculator.summ(5,6.1f));
        System.out.println(Calculator.summ(5,6.1));
        System.out.println(Calculator.difference(5,6));
        System.out.println(Calculator.difference(5,6.1f));
        System.out.println(Calculator.difference(5,6.1));
        System.out.println(Calculator.multiply(5,6));
        System.out.println(Calculator.multiply(5f,6));
        System.out.println(Calculator.multiply(5,6.2));
        System.out.println(Calculator.divide(5,2));
        System.out.println(Calculator.divide(5f,0));
        System.out.println(Calculator.divide(5d,2.5));

        Cat cat = new Cat("Крис",5);
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());

    }
}
