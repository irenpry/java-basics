package org.itmo.java.lesson6.exercise5;

import java.util.Scanner;

public class UntitledUser {
    private Integer age;
    Scanner scan = new Scanner(System.in);

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void enterInfo() {
        System.out.print("Введите возраст пользователя :");
        setAge(scan.nextInt());
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
