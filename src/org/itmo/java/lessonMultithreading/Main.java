package org.itmo.java.lessonMultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1 */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Какое кол-во потоков запустить?");
//        int threadCounts = scan.nextInt();
//        for (int i = 0; i < threadCounts; i++) {
//            Thread thread = new NumbersPrinter();
//            thread.start();
//        }
        /* 2 */
//        Thread thread = new Thread();
//        System.out.println(thread.getState());
//        thread.start();
//        System.out.println(thread.getState());
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(thread.getState());
        /* 3 */
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(r);
            thread.start();
        }
        /* 4 */
        new NameThread("Первый").start();
        new NameThread("Второй").start();
    }
}
