package org.itmo.java.lesson1;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    //1 задание
    System.out.println("Я");
    System.out.println("хорошо");
    System.out.println("знаю");
    System.out.println("Java");
    //2 задание
    double d = (46 + 10) * (10d / 3);
    System.out.println(d);
    int i = (29) * (4) * (-15);
    System.out.println(i);
    //3 задание
    int number = 10500;
    double result = ((double) number / 10) / 10;
    System.out.println(result);
    //4 задание
    result = 3.6 * 4.1 * 5.9;
    System.out.println(result);
    //5 задание
    Scanner scan = new Scanner(System.in);
    int i1 = scan.nextInt();
    int i2 = scan.nextInt();
    int i3 = scan.nextInt();
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    //6 задание
    int b = scan.nextInt();
    if (b % 2 != 0) {
        System.out.println("Нечетное");
    } else if (b > 100) {
        System.out.println("Выход за пределы диапазона");
    } else {
        System.out.println("Четное");
    }
}

}
