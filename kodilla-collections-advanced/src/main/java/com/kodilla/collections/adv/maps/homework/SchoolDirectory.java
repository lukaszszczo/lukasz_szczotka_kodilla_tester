package com.kodilla.collections.adv.maps.homework;


import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        School podstawowka = new School("Podstawówka", 21, 22, 12);
        School liceum = new School("Liceum", 11, 12, 14, 18, 56);
        School technikum = new School("Technikum", 11, 22, 22, 22, 22, 11, 22, 45, 66, 77);


        Principal adam = new Principal("Adam", "Nowak");
        Principal tomasz = new Principal("Tomasz", "Kowalski");
        Principal kasia = new Principal("Katarzyna", "Nowak");

        schoolMap.put(adam, podstawowka);
        schoolMap.put(tomasz, liceum);
        schoolMap.put(kasia, technikum);

        for (Map.Entry<Principal, School> infoEntry : schoolMap.entrySet())
            System.out.println(infoEntry.getKey().getPrincipalFirstName() + " " + infoEntry.getKey().getPrincipalLastName()
                    + " odpowiada za: " + infoEntry.getValue().toString() + " które liczy " + infoEntry.getValue().sumStudent() +
                    " uczniów w " + infoEntry.getValue().getSize() + " klasach");
    }
}
