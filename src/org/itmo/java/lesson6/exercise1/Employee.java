package org.itmo.java.lesson6.exercise1;

import java.util.Scanner;

public class Employee extends Human {
    private String bank;
    private Integer pin;

    public Employee(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    private Integer getPin() {
        return pin;
    }

    public void setPin() {
        this.pin = generatePin();
    }

    @Override
    public String getInfo() {
        return this.getSurname() + " " + this.getName() + " - это работник банка " + bank;
    }

    @Override
    public boolean askConfirm() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваш пин-код сотрудника ");
        return scan.nextInt() == this.pin;
    }

    public int generatePin() {
        int pin = (int) (Math.random() * 1000);
        System.out.println("Ваш новый pin: " + pin);
        return pin;
    }
}
