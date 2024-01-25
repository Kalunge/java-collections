package org.example.introduction;

import java.util.Collection;
import java.util.List;

public class ApplicationWithArrays {

    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("manchester", "Suite", 5, 250);
        Room piccadilly = new Room("picadily", "Guest Room", 3, 125.0);
        Room oxford = new Room("Suite", "Guest Room", 6, 250);

        Room[] rooms = new Room[3];
        rooms[0] = cambridge;
        rooms[1] = manchester;
        rooms[2] = piccadilly;

        Room[] moreRooms = new Room[3];
        System.arraycopy(rooms, 0, moreRooms, 0, rooms.length);
//        moreRooms

//        double total = getPotentialRoomRevenue(rooms);

//        System.out.println(total);
    }

    private static double getPotentialRoomRevenue(Collection<Room> rooms) {

        return rooms.stream().mapToDouble(room -> room.getRate()).sum();

//        return roomOne.getRate() + roomTwo.getRate() + roomThree.getRate();
    }


}
