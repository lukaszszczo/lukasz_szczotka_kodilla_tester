package com.kodilla.abstracts.homework;

public class Secretary extends Job {
    public Secretary(int salary, String responsibilities, String jobName) {
        super(3245, "Obsługa biura", "Sekretarka");
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
