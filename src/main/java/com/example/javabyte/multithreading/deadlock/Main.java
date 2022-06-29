package com.example.javabyte.multithreading.deadlock;

public class Main {
    public static void main(String[] args){
        DeadLockExample deadLock = new DeadLockExample();

        new Thread(() -> {
            try {
                deadLock.operation1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "T1").start();

        new Thread(()->{
            try{
                deadLock.operation2();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }, "T2").start();
    }
}
