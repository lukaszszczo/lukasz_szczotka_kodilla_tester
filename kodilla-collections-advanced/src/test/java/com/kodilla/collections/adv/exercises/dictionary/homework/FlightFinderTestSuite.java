package com.kodilla.collections.adv.exercises.dictionary.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightFinderTestSuite {

    @Test
    public void correctSize() {


        FlightFinder find = new FlightFinder();
        assertEquals(5, find.flightsList.size());
    }

    @Test
    public void shouldGetFlightDepartureSize() {

        FlightFinder find = new FlightFinder();
        assertEquals(2, find.findFlightsFrom("Berlin").size());
    }



    @Test
    public void shouldGetFlightOneArrival() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsTo("Cracow");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals("Cracow", f.getArrival());
        }
    }
    @Test
    public void shouldGetFlightTwoArrivals() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsTo("Oslo");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals("Oslo", f.getArrival());
        }
    }
    @Test
    public void shouldGetFlightZeroArrivals() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsTo("Katowice"); // brak takiego wpisu w FlightRepository

        // then
        assertTrue(result.isEmpty() == true); // zastanawialem sie czy powinna zostac czy nie
        for (Flight f : result) {
            assertEquals(null, f.getArrival());
        }
    }

    @Test
    public void shouldGetFlightOneDepartures() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsFrom("Warsaw");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals("Warsaw", f.getDeparture());
        }


    }
    @Test
    public void shouldGetFlightTwoDepartures() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsFrom("Berlin");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals("Berlin", f.getDeparture());
        }


    }
    @Test
    public void shouldGetFlightZeroDepartures() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsFrom("Cracow");

        // then
        assertTrue(result.isEmpty() == true);
        for (Flight f : result) {
            assertEquals("Cracow", f.getDeparture());
        }

    }
    @Test
    public void shouldGetFlightZeroDeparturesEmptyString() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsFrom("");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals(true, f.getDeparture().isEmpty());
        }

    }
    @Test
    public void shouldGetFlightZeroArrivalsEmptyString() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsTo("");

        // then
        assertTrue(result.isEmpty() == false);
        for (Flight f : result) {
            assertEquals(true, f.getArrival().isEmpty());
        }

    }
    @Test
    public void shouldGetFlightZeroArrivalsNull() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsTo((null));

        // then
        for (Flight f : result) {
            assertEquals(null, f.getArrival());
        }

    }
    @Test
    public void shouldGetFlightZeroDeparturesNull() {
        // given
        FlightFinder find = new FlightFinder();

        // when
        List<Flight> result = find.findFlightsFrom((null));

        // then
        for (Flight f : result) {
            assertEquals(null, f.getDeparture());
        }

    }









    // jeden przylot ?
//    dwa przyloty
// zero przylotów
//    jeden odlot ?
//    dwa odloty
//    zero odlotów

//    null
//    pusty string


}
