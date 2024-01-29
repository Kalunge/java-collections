package org.example.iterations;

import org.example.introduction.Room;
import org.example.list.Guest;

import java.util.*;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);

        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        Room westminster = new Room("westminster", "Premiere Room", 4, 200.00);

        Map<Room, Guest> assignment = new HashMap<>();
        assignment.put(victoria, john);
        assignment.put(westminster, maria);

        Set<Map.Entry<Room, Guest>> collectionView =assignment.entrySet();
        for (Map.Entry <Room, Guest> roomGuestEntry : collectionView) {
            Room r = roomGuestEntry.getKey();
            Guest g = roomGuestEntry.getValue();
            System.out.printf("%s : %s%n", r.getName(), g.getFirstName());
        }



//        Guest guest = assignment.put(westminster, assignment.remove(victoria));
//        assignment.putIfAbsent(victoria, guest);
//
//        System.out.println("victoria: " + assignment.get(victoria));
//        System.out.println("westminister: " + assignment.get(new Room("westminster", "Premiere Room", 4, 200.00)));
    }

    public static void print(Queue<String> dequeue) {
        System.out.format("%n--Deques Contents--%n");

        int x = 0;
        for (String msg : dequeue) {
            System.out.format("%x: %s %s %n", x++, msg, x==1 ? "(Top)":"");
        }
        System.out.println("");

    }

}


