package com.kodilla.abstracts.homework;


class Person {

    String firstName;
    int age;
    String job;

    private Person(String firstName, int age, String job) {
        
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person lukasz = new Person("Łukasz", 30, "Tester");
        Person adam = new Person("Adam", 55, "Policeman");
        Person tomek = new Person("Tomek", 34, "Secretary");

            }
        }

