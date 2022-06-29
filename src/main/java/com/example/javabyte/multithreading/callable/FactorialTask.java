package com.example.javabyte.multithreading.callable;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {

    private int num;

    public FactorialTask(int num){
        this.num = num;
    }

    @Override
    public Integer call() {

        int fact = 1;

        for (int i = num; i > 1; i--) {
            fact *= i;
        }

        return fact;
    }
}
