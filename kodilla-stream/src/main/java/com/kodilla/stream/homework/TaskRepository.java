package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Zadanie 1", LocalDate.of(2019, 11, 5), LocalDate.of(2013, 10, 10)));
        tasks.add(new Task("Zadanie 2", LocalDate.of(2018, 12, 10), LocalDate.of(2014, 10, 10)));
        tasks.add(new Task("Zadanie 3", LocalDate.of(2017, 1, 20), LocalDate.of(2015, 10, 10)));
        tasks.add(new Task("Zadanie 4", LocalDate.of(2016, 2, 11), LocalDate.of(2016, 10, 10)));
        tasks.add(new Task("Zadanie 5", LocalDate.of(2015, 3, 13), LocalDate.of(2017, 10, 10)));
        tasks.add(new Task("Zadanie 6", LocalDate.of(2014, 4, 14), LocalDate.of(2018, 10, 10)));
        tasks.add(new Task("Zadanie 7", LocalDate.of(2013, 5, 15), LocalDate.of(2020, 5, 6)));
        tasks.add(new Task("Zadanie 8", LocalDate.of(2012, 6, 16), LocalDate.of(2020, 5, 7)));
        tasks.add(new Task("Zadanie 9", LocalDate.of(2011, 7, 11), LocalDate.of(2020, 5, 8)));
        tasks.add(new Task("Zadanie 10", LocalDate.of(2010, 8, 10), LocalDate.of(2022, 10, 10)));
        tasks.add(new Task("Zadanie 11", LocalDate.of(2009, 9, 20), LocalDate.of(2023, 10, 10)));
        tasks.add(new Task("Zadanie 12", LocalDate.of(2008, 10, 10), LocalDate.of(2024, 10, 10)));
        tasks.add(new Task("Zadanie 13", LocalDate.of(2007, 11, 20), LocalDate.of(2025, 10, 10)));
        tasks.add(new Task("Zadanie 14", LocalDate.of(2006, 12, 20), LocalDate.of(2026, 10, 10)));


        return tasks;
    }
}
