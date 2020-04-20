package com.kodilla.abstracts.homework;

public class Tester extends Job {
    public Tester(int salary, String responsibilities, String jobName) {
        super(4000, "Testowanie aplikacji", "Tester");
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
