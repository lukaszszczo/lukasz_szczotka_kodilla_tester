package com.kodilla.abstracts.homework;

public class Policeman extends Job {
    public Policeman(int salary, String responsibilities, String jobName) {
        super(3000, "Dbanie o porzadek w kraju", "Policjant");
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public String getJobName() {
        return jobName;
    }

}
