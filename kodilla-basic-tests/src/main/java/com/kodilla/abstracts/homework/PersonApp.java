package com.kodilla.abstracts.homework;

public class PersonApp {
    public static void main(String[] args) {
        Person adam = new Person("Adam", 23, new Tester(7000, "Testuje aplikacje", "Tester"));
        Person ewa = new Person("Ewa", 25, new Secretary(5000, "Praca biurowa", "Sekretarka"));
        Person jola = new Person("Jolanta", 28, new Policeman(6000, "Dba o porzadek", "Policjant"));


        System.out.println(adam.getFirstName() + " z zawodu jest " + adam.getJob().getJobName() + " a jego obowiazki to " + adam.getJob().getResponsibilities());
        System.out.println(ewa.getFirstName() + " z zawodu jest " + ewa.getJob().getJobName() + " a jej obowiazki to " + ewa.getJob().getResponsibilities());
        System.out.println(jola.getFirstName() + " z zawodu jest " + jola.getJob().getJobName() + " a jej obowiazki to " + jola.getJob().getResponsibilities());


    }


}
