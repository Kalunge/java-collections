package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);

        List<Guest> checkList = new ArrayList<>(100);
        checkList.add(john);
        checkList.add(maria);


        checkList.add(0, sonia);
        checkList.get(2).setLoyaltyProgramMember(true);
        checkList.addAll(1, List.of(maria, siri));
        checkList.remove(checkList.size() - 1);

        print(checkList);
        System.out.println(checkList.indexOf(john) + 1);


    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }

    }
}
