package org.itmo.java.lesson2;

public class Calculator {

    static {
        System.out.println("Запустился статик блок");
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static float summ(float a, float b) {
        return a + b;
    }

    public static double summ(double a, double b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static float difference(float a, float b) {
        return a - b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.err.println("Делить на ноль нельзя!");
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static double divide(float a, float b) {
        if (b == 0) {
            System.err.println("Делить на ноль нельзя!");
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Делить на ноль нельзя!");
            return 0;
        } else {
            return a / b;
        }
    }
}
