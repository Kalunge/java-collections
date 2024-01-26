package org.example.set;

import org.example.introduction.Room;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;

public class TreeSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500, 433, 454, 2323, 5454, 2323);
        NavigableSet<Integer> numberTree = new java.util.TreeSet<>(numbers);

        numberTree.headSet(500)
                .stream()
                .forEach(System.out::println);
    }

//    headset
//    subset
//    lower
//    higher
//    descendset
}
