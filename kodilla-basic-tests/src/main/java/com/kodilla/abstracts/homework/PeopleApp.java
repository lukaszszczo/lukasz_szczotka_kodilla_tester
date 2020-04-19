package com.kodilla.abstracts.homework;

public class PeopleApp {

    public static void main(String[] args) {
//        Tester tester = new Tester(5000, "testing");

        Person lukasz = new Person("Łukasz", 30, new Tester(5000, "testing"));

        lukasz.getJob().getResponsibilities();

//        Person adam = new Person("Adam", 55, "Policeman");
//        Person tomek = new Person("Tomek", 34, "Secretary");

    }
}
