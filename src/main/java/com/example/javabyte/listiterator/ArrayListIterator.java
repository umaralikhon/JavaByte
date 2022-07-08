package com.example.javabyte.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("I");
        list.add("am");
        list.add("checking");
        list.add("listIterator");

        System.out.println(list);
        System.out.println();

        ListIterator<String> iterator = list.listIterator(2);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
