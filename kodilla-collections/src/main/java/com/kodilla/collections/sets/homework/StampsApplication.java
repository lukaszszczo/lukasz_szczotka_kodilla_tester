package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mieszko", 10, 20, true)); // on1
        stamps.add(new Stamp("Robert", 13, 20, true));
        stamps.add(new Stamp("Adam", 15, 20, false));
        stamps.add(new Stamp("Marek", 18, 20, true));
        stamps.add(new Stamp("Jusia", 19, 20, false));
        stamps.add(new Stamp("Dominik", 13, 20, true)); // on2
        stamps.add(new Stamp("Dominik", 13, 20, true));  // on2
        stamps.add(new Stamp("Aga", 11, 20, false));
        stamps.add(new Stamp("Robert", 10, 20, true));
        stamps.add(new Stamp("Mieszko", 10, 20, true)); // on1
        stamps.add(new Stamp("Mieszko", 10, 20, true)); // on1
        stamps.add(new Stamp("Mieszko", 10, 20, true)); // on1
        stamps.add(new Stamp("Mieszko", 10, 20, false));

        System.out.println("Zbiór zawiera: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }
}
