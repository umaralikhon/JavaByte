package com.example.javabyte.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Lenovo", 1200));
        products.add(new Product(2, "HP", 1500));
        products.add(new Product(3, "Apple", 1300));
        products.add(new Product(4, "Asus", 1000));
        products.add(new Product(5, "Acer", 1100));
        products.add(new Product(6, "Dell", 1500));


        //-----Filtering-----//
        System.out.println("Filtering");
        List<String> productPriceList = products
                .stream()
                .filter(p -> p.getPrice() > 1100) //Filtering
                .map(p -> p.getName() + " " + p.getPrice())//Fetching
                .collect(Collectors.toList()); //Collecting

        System.out.println(productPriceList);
        System.out.println();
        //-----------------//


        //-----Iterating-----//
        Stream
                .iterate(1, e -> e + 1)
                .filter(e -> e % 5 == 0)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();
        //-----------------//


        //-----Filtering&Iterating-----//
        System.out.println("FILTERING AND ITERATING");
        products
                .stream()
                .filter(p -> p.getPrice() > 1100)
                .forEach(p -> System.out.println(p.getName() + " " + p.getPrice()));

        System.out.println();
        //-----------------//


        //-----Counting Sum-----//
        System.out.println("COUNTING SUM:");
        int totalPrice = products
                .stream()
                .collect(Collectors.summingInt(p -> p.getPrice()));

        System.out.println("Total price: " + totalPrice + "\n\n");
        //-----------------//


        //-----Find Max&Min-----//
        System.out.println("FINDING MAX & MIN");


        Product productA = products
                .stream()
                .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println("Max: " + productA.getPrice());

        Product productB = products
                .stream()
                .min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println("Min: " + productB.getPrice() + "\n\n");
        //-----------------//


        //-----Counting-----//
        System.out.println("COUNTING: ");
        long count = products
                .stream()
                .filter(p -> p.getPrice() < 1500)
                .count();

        System.out.println("Count: " + count + "\n\n");
        //-----------------//


        //-----Convert List to Set-----//
        System.out.println("CONVERTING LIST TO SET:");
        Set<Product> productsSet = products
                .stream()
                .filter(p->p.getPrice() > 1200)
                .collect(Collectors.toSet());

        System.out.println(productsSet);
        System.out.println("\n\n");
        //-----------------//


        //-----Convert List to Map-----//
        System.out.println("CONVERTING LIST TO MAP:");
        Map<Integer, Product> productMap = products
                .stream()
                .collect(Collectors.toMap(p->p.getId(), p -> p));

        System.out.println(productMap);
        //-----------------//
    }
}
