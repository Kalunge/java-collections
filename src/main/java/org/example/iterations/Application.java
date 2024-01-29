package org.example.iterations;

import org.example.introduction.Room;
import org.example.list.Guest;

import java.util.*;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {
        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", true);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);
        Guest bob = new Guest("Bob", "Doe", false);

        Comparator<Guest> programComp =     Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();


        Queue<Guest> checkinQueue = new PriorityQueue<>(programComp);
//        Queue<Guest> checkinQueue = new ArrayDeque<>();
//        checkinQueue.offer(john);
//        checkinQueue.offer(maria);
//        checkinQueue.offer(sonia);
//        checkinQueue.offer(siri);
//        print(checkinQueue);
////        remove returns exception and poll returns null
//        Guest guest = checkinQueue.poll();
//        print(checkinQueue);
//        System.out.println(guest);
//
//        Guest guest1 = checkinQueue.peek();
//        print(checkinQueue);
//        System.out.println(guest1);
//        methods that throw an error
        checkinQueue.add(john);
        checkinQueue.add(maria);
        checkinQueue.add(sonia);
        checkinQueue.add(siri);
        checkinQueue.add(maria);
        print(checkinQueue);
//        remove returns exception and poll returns null
        Guest guest = checkinQueue.remove();
        print(checkinQueue);
        System.out.println(guest);

        Guest guest1 = checkinQueue.element();
        print(checkinQueue);
        System.out.println(guest1);

//        poll removes while peek just peeks


    }

    public static void print(Queue<Guest> queue) {

        System.out.format("%n--Queue Contents--%n");

        int x = 0;
        for (Guest guest : queue) {
            System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)" : "");
        }

        System.out.println("");

    }

}


