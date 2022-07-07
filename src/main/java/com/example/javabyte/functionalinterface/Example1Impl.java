package com.example.javabyte.functionalinterface;

public class Example1Impl implements Example1{

    @Override
    public void say(String message){
        System.out.println("Hello " + message);
    }
}
