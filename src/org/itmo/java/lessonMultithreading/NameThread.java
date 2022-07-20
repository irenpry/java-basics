package org.itmo.java.lessonMultithreading;

public class NameThread extends Thread {
    private String name;
    private static final Object stop = new Object();

    public NameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (stop) {
                try {
                System.out.println(this.name);
                stop.notify();
                stop.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
