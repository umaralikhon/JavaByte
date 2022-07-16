package com.example.javabyte.functionalinterface.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List<String> cityList = Arrays.asList("Moscow", "Tashkent", "Kiev");
        cityList.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println(cityList);
        System.out.println();


        System.out.println("FLATMAP:");

        List<String> productList1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productList2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productList3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productList4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

        List<List<String>> allProducts = new ArrayList<>();
        allProducts.add(productList1);
        allProducts.add(productList2);
        allProducts.add(productList3);
        allProducts.add(productList4);

        List<String> flatMapList = allProducts.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
