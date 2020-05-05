package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "Oslo"));
        flightsTable.add(new Flight("Berlin", "Cracow"));
        flightsTable.add(new Flight("Tokio", "Warsaw"));
        flightsTable.add(new Flight("Berlin", "Oslo"));
        flightsTable.add(new Flight("", ""));
      //  flightsTable.add(new Flight(null, null));

        return flightsTable;
    }


}
