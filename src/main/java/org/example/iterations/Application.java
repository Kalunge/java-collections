package org.example.iterations;

import org.example.introduction.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175.00);
        Room manchester = new Room("manchester", "Suite", 5, 250);
        Room piccadilly = new Room("picadily", "Guest Room", 3, 125.0);
        Room oxford = new Room("oxford", "Guest Room", 6, 250);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, manchester, piccadilly, oxford));
        oxford.setPetFriendly(true);
        cambridge.setPetFriendly(true);

        rooms.stream()
                .filter(new Predicate<Room>() {
                    @Override
                    public boolean test(Room room) {
                        return room.isPetFriendly();
                    }
                }).forEach(new Consumer<Room>() {
                    @Override
                    public void accept(Room room) {
                        System.out.println(room.getName());
                    }
                });


    }
}
