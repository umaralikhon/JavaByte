package com.example.javabyte.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Example1 example = new Example1Impl();
        example.say("World");

        //------STANDARD FUNCTIONAL INTERFACES------//
        //------Predicate------//
        Predicate<Integer> predicate = a -> (a >= 10);
        boolean pred = predicate.test(15);
        System.out.println("PREDICATE: " + pred + "\n");
        //===========================================================================//

        //------BiConsumer------//
        BiConsumer<String, Integer> biConsumer = (str, num) -> {
            System.out.println(str + " " + num);
        };

        System.out.print("BICONSUMER: ");
        biConsumer.accept("Java Version:", 8);
        System.out.println();
        //===========================================================================//

        //------Function------//
        Function<String, String> function = FunctionExample::show;
        System.out.println("FUNCTIONAL: " + function.apply("Veronica") + "\n");
        //===========================================================================//
    }
}
