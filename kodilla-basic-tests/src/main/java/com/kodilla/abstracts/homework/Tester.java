package com.kodilla.abstracts.homework;

public class Tester extends Job {
    public Tester(int salary, String responsibilities) {
        super(4000, "Testowanie aplikacji");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }


}
