package org.example.iterations;

import org.example.introduction.Room;

import java.util.*;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("manchester", "Suite", 5, 250);
        Room piccadilly = new Room("picadily", "Guest Room", 3, 125.0);
        Room oxford = new Room("oxford", "Guest Room", 6, 250);
        Room oxfordDuplicate = new Room("oxford", "Guest Room", 6, 250);

        Set<Room> rooms = new HashSet<>();
        Set<Room> otherRooms = Set.of(piccadilly, oxford);
//        otherRooms.add(cambridge);


        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        rooms.add(manchester);


        Set<Room> moreRooms = Set.copyOf(rooms);

        moreRooms.stream().map(r -> r.getName()).forEach(System.out::println);


    }

}


