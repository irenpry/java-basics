package org.itmo.java.lessonMultithreading;
//test
class Counter {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
        System.out.println(count);
    }

    public int getCount() {
        return count;
    }
}
