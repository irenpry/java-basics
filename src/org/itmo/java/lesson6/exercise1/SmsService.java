package org.itmo.java.lesson6.exercise1;

public class SmsService {
    public void sendSms(long phoneNumber, String text) {
        //код отправки смс
        System.out.println("На телефон " + phoneNumber + " отправлена sms: " + text);
    }
}
