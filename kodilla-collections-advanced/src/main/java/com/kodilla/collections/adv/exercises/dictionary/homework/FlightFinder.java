
package com.kodilla.collections.adv.exercises.dictionary.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FlightFinder {


    public List<Flight> flightsList;

    public FlightFinder() {
        flightsList = FlightRepository.getFlightsTable();
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight temp : flightsList) {
            if (temp.getDeparture().equals(departure)) {
                flightsFrom.add(temp);
            }
        }

        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight temp : flightsList) {
            if (temp.getArrival().equals(arrival)) {
                flightsTo.add(temp);
            }
        }

        return flightsTo;
    }


}

