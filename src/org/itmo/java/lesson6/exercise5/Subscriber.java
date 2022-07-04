package org.itmo.java.lesson6.exercise5;

public class Subscriber extends User {
    public Subscriber(String name) {
        super(name);
    }

    @Override
    public void enterAge() {
        int age = askAge();
        while (age < 14 || age > 150) {
            if (age < 14 && age > 0) {
                System.out.println("Подписка доступна только с 14 лет");
            } else {
                System.out.println("Допустимые значения: от 14 до 150");
            }
            age = askAge();
        }
        setAge(age);
    }
}
