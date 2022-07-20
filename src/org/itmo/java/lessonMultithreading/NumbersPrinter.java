package org.itmo.java.lessonMultithreading;

public class NumbersPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.println(i + " - это число из потока: " + NumbersPrinter.currentThread().getName());
        }
    }
}
