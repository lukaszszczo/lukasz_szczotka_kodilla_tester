package com.kodilla.abstracts.homework;


class Person {



    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person pracownik1 = new Person("Łukasz", 30, "Tester");
        Person pracownik2 = new Person("Adam", 55, "Policeman");
        Person pracownik3 = new Person("Tomek", 34, "Secretary");


        System.out.println("Osoba " + pracownik1.firstName + " o zawodzie " + pracownik1.job +
                " a jego obowiazki to " );


            }
        }

