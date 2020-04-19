        package com.kodilla.abstracts.homework;

public class Secretary extends Job {
    public Secretary(int salary, String responsibilities) {
        super(3245, "Obsługa biura");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }


}
