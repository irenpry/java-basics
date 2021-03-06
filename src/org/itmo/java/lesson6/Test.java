package org.itmo.java.lesson6;

import org.itmo.java.lesson6.exercise1.Client;
import org.itmo.java.lesson6.exercise1.Employee;
import org.itmo.java.lesson6.exercise3.Truck;
import org.itmo.java.lesson6.exercise4.Child;
import org.itmo.java.lesson6.exercise5.User;
import org.itmo.java.lesson6.exercise5.UntitledUser;

public class Test {
    public static void main(String[] args) {
        Client client = new Client("Виктор", "Сидоров", "Альфа банк");
        Employee employee = new Employee("Дарья", "Мелихова", "Сбербанк");
        System.out.println(client.getInfo());
        System.out.println(employee.getInfo());
        employee.setPin();
        client.setPhoneNumber(79519586111L);
        System.out.println(client.askConfirm() ? "операция разрешена" : "операция запрещена");
        System.out.println(employee.askConfirm() ? "операция разрешена" : "операция запрещена");


        Truck truck = new Truck(10000, "Volvo FH", 'w', 200.04F, 10, 30000);
        truck.outPut();
        truck.newWheels(12);
        truck.outPut();

        Child child = new Child(4);
        child.printNumber();

        UntitledUser user = new UntitledUser();
        user.enterInfo();
        System.out.println(user);
        User subscriber = new User();
        subscriber.enterInfo();
        System.out.println(subscriber);

    }
}
