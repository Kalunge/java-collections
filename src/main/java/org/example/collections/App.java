package org.example.collections;

import org.example.introduction.Room;

import java.awt.*;
import java.util.*;

public class App {
    public static  void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Programming");
        collection.add("Chess");
        collection.add("Theology");
        collection.add("Programming");
        collection.add("Family");

        Collection<String> favouriteThings = new HashSet<>(collection);

//        raw type collection
        Collection collection0ne = new ArrayList();
        collection0ne.add("Cambridge");
        collection0ne.add(1L);
        collection0ne.add(new Room("cambridge", "suite", 5, 172.44));

//        collection0ne.stream().forEach( e -> System.out.println(e.getClass()));

//
        Collection<Room> collectionTwo = new ArrayList<>();
        collectionTwo.add(new Room("cambridge", "suite", 5, 172.44));
        collectionTwo.stream().forEach(e -> System.out.println(e.getCapacity()));
//        System.out.println(favouriteThings);
//        System.out.println(collection);


    }
}
