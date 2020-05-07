package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Aplication {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Nowak", new Teacher("Jan Kowalski")));
        students.add(new Student("Tomasz Nowak", new Teacher("Jan3 Polska")));
        students.add(new Student("Jacek Nowak", null));
        students.add(new Student("Łukasz Nowak", new Teacher("Jan5 Szwajcaria")));
        students.add(new Student("Robert Nowak", null));

        // Optional<List<Student>> optionalStudent = Optional.ofNullable(students);
        // List<String> test = optionalStudent.orElse(new Student("test",new Teacher("gfd")))

        for (Student temp : students) {

            System.out.println("Uczeń: " + temp.getName() + "| Nauczyciel: " + temp.getTeacher().getName());


        }

        //Optional<List<Student>> optionalStudent = Optional.ofNullable(students);
        //


    }
}
