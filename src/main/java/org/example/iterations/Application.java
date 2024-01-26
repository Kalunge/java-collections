package org.example.iterations;

import org.example.introduction.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("manchester", "Suite", 5, 250);
        Room piccadilly = new Room("picadily", "Guest Room", 3, 125.0);
        Room oxford = new Room("oxford", "Guest Room", 6, 250);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, manchester, piccadilly, oxford));
        oxford.setPetFriendly(true);
        cambridge.setPetFriendly(true);

        rooms.stream().filter(Room::isPetFriendly).forEach(room -> System.out.println(room.getName()));


//        rooms.stream().filter(room -> room.isPetFriendly()).forEach(room -> System.out.println(room.getName()));

    }

}


