package com.example.javabyte.serialization;

public class Main {
    public static void main(String[] args) {

        Persist persist = new Persist();

        persist.serializeObject();
        persist.deserializeObject();
    }
}
