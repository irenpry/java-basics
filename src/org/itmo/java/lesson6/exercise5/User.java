package org.itmo.java.lesson6.exercise5;

import java.util.Scanner;

public class User {
    private String name;
    private Integer age;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void enterAge() {
        int age = askAge();
        while (age < 1 || age > 150) {
            System.out.println("Допустимые значения: от 1 до 150");
            age = askAge();
        }
        setAge(age);
    }

    public int askAge() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите ваш возраст: ");
        return scan.nextInt();
    }
}
