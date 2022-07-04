package org.itmo.java.lesson6.exercise1;

import java.util.Scanner;

public class Client extends Human implements Confirmer {
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

    @Override
    public boolean askConfirm() {
        int smsCode = (int) (Math.random() * 1000);
        String smsText = "Для подтверждения операции введите " + smsCode;
        SmsService smsService = new SmsService();
        smsService.sendSms(this.getPhoneNumber(),smsText);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите код из СМС ");
        if (scan.nextInt() == smsCode) {
            return true;
        }
        return false;
    }
}
