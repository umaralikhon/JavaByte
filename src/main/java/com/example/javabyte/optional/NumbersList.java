package com.example.javabyte.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumbersList {
    private List<Integer> numbers;
    private Optional<Integer> min;
    private Optional<Integer> max;

    public void init(){
        numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{}));
    }

    public void findMin(){
        min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElse(0));
    }

    public void findMax(){
        max = numbers.stream().max(Integer::compare);
        System.out.println(max.orElse(10));
    }
}

