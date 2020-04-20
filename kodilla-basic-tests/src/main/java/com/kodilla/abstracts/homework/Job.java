package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;
    String jobName;


    public Job(int salary, String responsibilities, String jobName) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.jobName = jobName;
    }


    public abstract String getResponsibilities();

    public abstract String getJobName();


}
