package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    public Policeman(int salary, String responsibilities) {
        super(3000, "Dbanie o porzadek wewnatrzny kraju");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }


}
