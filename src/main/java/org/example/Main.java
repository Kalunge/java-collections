package org.example;

import org.example.introduction.Room;

import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("manchester", "Suite", 5, 250);
        Room piccadilly = new Room("picadily", "Guest Room", 3, 125.0);
        Room oxford = new Room("Suite", "Guest Room", 6, 250);

        Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);


        double total = getPotentialRoomRevenue(rooms);

        System.out.println(total);
    }

    private static double getPotentialRoomRevenue(Collection<Room> rooms) {

        return rooms.stream().mapToDouble(room -> room.getRate()).sum();

//        return roomOne.getRate() + roomTwo.getRate() + roomThree.getRate();
    }


}