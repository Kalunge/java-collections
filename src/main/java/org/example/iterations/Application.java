package org.example.iterations;

import org.example.introduction.Room;
import org.example.list.Guest;

import java.util.*;
import java.util.stream.Collectors;


public class Application {
    public static void main(String[] args) {

        Deque<String> messageStack = new ArrayDeque<>();
        messageStack.push("Message 1");
        messageStack.push("Message 2");
        messageStack.push("Message 3");
        messageStack.push("Message 4");

        print(messageStack);
        System.out.println(messageStack.pop());
        System.out.println(messageStack.pop());
        print(messageStack);
        messageStack.push("Message 5");
        System.out.println(messageStack.peek());

        print(messageStack);
    }

    public static void print(Queue<String> dequeue) {
        System.out.format("%n--Deques Contents--%n");

        int x = 0;
        for (String msg : dequeue) {
            System.out.format("%x: %s %s %n", x++, msg, x==1 ? "(Top)":"");
        }
        System.out.println("");

    }

}


