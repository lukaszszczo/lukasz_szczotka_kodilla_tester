package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;


public class Aplication {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Nowak", new Teacher("Jan Kowalski")));
        students.add(new Student("Tomasz Nowak", new Teacher("Jan3 Polska")));
        students.add(new Student("Jacek Nowak", null));
        students.add(new Student("Łukasz Nowak", new Teacher("Jan5 Szwajcaria")));
        students.add(new Student("Robert Nowak", null));



        for (Student temp : students) {
            System.out.println("uczen " + temp.getName() + " nauczyciel " + temp.getTeacher().orElse (new Teacher("<undefined>")));


        }

        }




    }

