package com.kodilla.collections.adv.exercises.dictionary.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void correctSize() {


        FlightFinder find = new FlightFinder();
        assertEquals(4, find.flightsList.size());
    }

    @Test
    public void shouldGetFlightDepartureSize() {

        FlightFinder find = new FlightFinder();
        assertEquals(2, find.findFlightsFrom("Berlin").size());
    }

    @Test
    public void shouldGetFlightDeparture() { //
        FlightFinder find = new FlightFinder();
        List<Flight> result = find.findFlightsFrom("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw","Oslo"));
        assertEquals(expectedList,result);
    }
    @Test
    public void shouldGetFlightArrival() {
        FlightFinder find = new FlightFinder();
        List<Flight> result = find.findFlightsTo("Oslo");
        List<Flight> expectedList =  new ArrayList<>();
        expectedList.add(new Flight("Warsaw","Oslo"));
        expectedList.add(new Flight("Berlin","Oslo"));
        expectedList.add(new Flight("Berlin","Oslo"));
        assertEquals(expectedList,result);
    }


}
