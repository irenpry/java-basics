package org.itmo.java.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {

        System.out.println("/* Первое задание */");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("/* Второе задание */");
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a.add(i);
                b.add(i);
                c.add(i);
            } else if (i % 3 == 0) {
                a.add(i);
            } else if (i % 5 == 0) {
                b.add(i);
            }
        }
        System.out.println("Делятся на 3: " + a);
        System.out.println("Делятся на 5: " + b);
        System.out.println("Делятся на 3 и на 5: " + c);

        System.out.println("/* Третье задание */");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b1 = scan.nextInt();
        System.out.print("Введите третье число: ");
        int c1 = scan.nextInt();
        System.out.println("Результат: " + (a1 + b1 == c1));

        System.out.println("/* Четвертое задание */");
        System.out.print("Введите первое число: ");
        int a2 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b2 = scan.nextInt();
        System.out.print("Введите третье число: ");
        int c2 = scan.nextInt();
        System.out.println("Результат: " + (b2 > a2 && c2 > b2));

        System.out.println("/* Пятое задание */");
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        int[] array1 = {0, -3, 7, 1, 1, 4, 3};
        System.out.println((array[0] == 3 && array[array.length-1] == 3));
        System.out.println((array1[0] == 3 && array[array1.length-1] == 3));

        System.out.println("/* Шестое задание  */");
        Boolean result = false;
        for (int i : array1) {
            if (i == 1 || i == 3) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
