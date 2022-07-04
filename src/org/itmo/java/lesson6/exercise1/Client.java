package org.itmo.java.lesson6.exercise1;

public class Client extends Human {
    private String bank;

    public Client(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String getInfo() {
        return this.getSurname() + " " + this.getName() + " - это клиент банка " + bank;
    }
}
