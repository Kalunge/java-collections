package org.example.introduction;

import java.util.Collection;
import java.util.List;

public class Application {
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
