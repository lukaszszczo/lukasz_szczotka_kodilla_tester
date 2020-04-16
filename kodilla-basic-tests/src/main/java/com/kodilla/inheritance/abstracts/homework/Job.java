package com.kodilla.inheritance.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;


    public Job( int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;

    }

    public String getResponsibilities() {
        return responsibilities;
    }
    public int getSalary() {
        return salary;
    }

    public abstract void giveJob();
}
