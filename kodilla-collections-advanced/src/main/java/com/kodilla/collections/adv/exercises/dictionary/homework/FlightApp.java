package com.kodilla.collections.adv.exercises.dictionary.homework;



public class FlightApp {
    public static void main(String[] args) {
        FlightFinder test = new FlightFinder();

        System.out.println("--------Lista lotów----------");
        for (Flight temp : test.flightsList) {
            System.out.println(temp.getDeparture() + " " + temp.getArrival());

        }

        System.out.println("--------------------------------------------");
        System.out.println("Przylot do Warszawy z :");
        for (Flight temp : test.findFlightsTo("Warsaw")) {
            System.out.println(temp.getDeparture() + " " + temp.getArrival());

        }

        System.out.println("--------------------------------------------");
        System.out.println("Przylot do Oslo z :");
        for (Flight temp : test.findFlightsTo("Oslo")) {
            System.out.println(temp.getDeparture() + " " + temp.getArrival());

        }
        System.out.println("--------------------------------------------");

        for (Flight temp : test.findFlightsFrom("Warsaw")) {
            System.out.println(temp.getDeparture() + " " + temp.getArrival());

        }
    }
}
