package org.example.challenges;

import org.example.introduction.Room;

import java.util.*;

public class RoomService {

    private Collection<Room> inventory;

    public RoomService() {
        this.inventory = new LinkedHashSet<>();
    }

    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.

        return this.inventory.contains(room);
    }

    public Collection<Room> asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
      return List.of(this.inventory.toArray(new Room[0]));

    }

    public Collection<Room> getByType(String type){

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(r -> !r.getType().equals(type));

        return copy;

    }

    public Collection<Room> getInventory() {
        return new HashSet<>(this.inventory);
    }

    public void createRoom(String name, String type, int capacity, double price) {
        this.inventory.add(new Room(name, type, capacity, price));
    }

    public void createRooms(Room[] rooms) {
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {
        this.inventory.remove(room);
    }

}
