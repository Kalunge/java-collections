package org.example.challenges;

import org.example.introduction.Room;

import java.util.*;

public class RoomService {

    // 1. Declare a Collection to store Room Inventory
    private Collection<Room> inventory;

    public RoomService() {

        // 2. Initialize Collection and assign it to the Room Inventory
        this.inventory = new ArrayList<>();

    }

    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory

        return inventory;

    }


    public void createRoom(String name, String type, int capacity, double rate) {

        // 4. Add a new Room to the Room Inventory using the provided parameters
        Room newRoom = new Room(name, type, capacity, rate);
        inventory.add(newRoom);

    }

    public void createRooms(Room[] rooms) {

        this.inventory.addAll(List.of(rooms));

        // 5. Add the Rooms provided in the Array to the Room Inventory

    }

    public void removeRoom(Room room) {

        // 6. Remove the provided Room from the Room Inventory
        inventory.remove(room);
    }

}
