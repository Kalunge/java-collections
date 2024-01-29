package org.example.iterations;

import org.example.introduction.Room;
import org.example.list.Guest;

import java.util.*;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordSuite = new Room("Oxford", "Premiere Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

        List<Room> rooms = new ArrayList<>(List.of(cambridge, manchester, piccadilly, oxford, oxfordSuite, victoria, westminister));

//        Collections.sort(rooms);
//        Collections.sort(rooms, Comparator.naturalOrder());
        rooms.sort(Comparator.naturalOrder());

        rooms.stream().forEach(r -> System.out.format("%-15s %-15s -%10f %n", r.getName(), r.getType(), r.getRate()));

    }

    public static void print(Queue<String> dequeue) {
        System.out.format("%n--Deques Contents--%n");

        int x = 0;
        for (String msg : dequeue) {
            System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)" : "");
        }
        System.out.println("");

    }

}


