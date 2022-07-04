package org.itmo.java.lesson6.exercise5;

public class User extends UntitledUser {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void enterInfo() {
        System.out.print("Введите имя пользователя: ");
        setName(super.scan.nextLine());
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
