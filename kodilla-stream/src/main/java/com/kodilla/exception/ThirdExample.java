package com.kodilla.exception;

public class ThirdExample {

    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna stst" + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("nie ma go w bazie");
        } finally {
            System.out.println("thank you");
        }


    }
}
