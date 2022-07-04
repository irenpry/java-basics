package org.itmo.java.lesson6.exercise4;

import java.util.Scanner;

public class Parent {
    private Integer number;

    public Parent(int number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        this.number = scan.nextInt();
    }
}
