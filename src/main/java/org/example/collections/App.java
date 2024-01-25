package org.example.collections;

import java.util.*;

public class App {
    public static  void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Programming");
        collection.add("Chess");
        collection.add("Theology");
        collection.add("Programming");
        collection.add("Family");

        System.out.println(collection);


    }
}
