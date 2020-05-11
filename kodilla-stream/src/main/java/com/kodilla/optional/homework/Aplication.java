package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Aplication {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Nowak", new Teacher("Jan Kowalski")));
        students.add(new Student("Tomasz Nowak", new Teacher("Jan3 Polska")));
        students.add(new Student("Jacek Nowak", null));
        students.add(new Student("Łukasz Nowak", new Teacher("Jan5 Szwajcaria")));
        students.add(new Student("Robert Nowak", null));



        for (Student temp : students) {
            Optional <Teacher> optionalTeacher = Optional.ofNullable(temp.getTeacher());
            Teacher teacher = optionalTeacher.orElse(new Teacher("<unifideded>"));
            System.out.println("uczen " + temp.getName() + " nauczyciel " + teacher.getName());


        }

        }




    }

