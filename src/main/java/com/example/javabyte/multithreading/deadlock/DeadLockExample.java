package com.example.javabyte.multithreading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public void operation1() throws InterruptedException {
        lock1.lock();
        System.out.println("Lock1 waiting lock2");
        Thread.sleep(3000);

        lock2.lock();
        System.out.println("lock2 acquired");

        lock1.unlock();
        lock2.unlock();
    }

    public void operation2() throws InterruptedException {
        lock2.lock();
        System.out.println("Lock2 waiting lock1");
        Thread.sleep(5000);

        lock1.lock();
        System.out.println("lock1 acquired");

        lock1.unlock();
        lock2.unlock();
    }
}
