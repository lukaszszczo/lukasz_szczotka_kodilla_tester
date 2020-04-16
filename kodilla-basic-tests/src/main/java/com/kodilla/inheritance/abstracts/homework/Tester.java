package com.kodilla.inheritance.abstracts.homework;

public class Tester extends Job {
    public Tester(int salary, String responsibilities) {
        super(4000, "Testowanie aplikacji");
    }

    @Override
    public void giveJob() {
        getResponsibilities();
    }
}
