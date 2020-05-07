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
        students.add(new Student("Jacek Nowak", new Teacher(null)));
        students.add(new Student("Łukasz Nowak", new Teacher("Jan5 Szwajcaria")));
        students.add(new Student("Robert Nowak", new Teacher(null)));

        for (Student temp:students) {
            System.out.println(temp.getName() + temp.getTeacher().getName());

        }

       /* Optional<List<Student>> optionalStudent = Optional.ofNullable(students);
        List<String> test =optionalStudent.orElse(new Student("test",new Teacher("aedsfadsgf")))*/





    }
}
