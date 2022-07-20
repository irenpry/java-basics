package org.itmo.java.lessonMultithreading;

public class NameThread extends Thread {
    private String name;
    private static final Object monitor = new Object();

    public NameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                try {
                    System.out.println(this.name);
                    monitor.notify();
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
