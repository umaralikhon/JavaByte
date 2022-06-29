package com.example.javabyte.multithreading.callable;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
	// write your code here

        FactorialTask fuck = new FactorialTask(5);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(fuck);

        int num = future.get().intValue();
        executor.shutdown();

        System.out.println(num);
    }
}
