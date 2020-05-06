package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> dedlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(u.currentTime()))
                .map(u -> u.getDeadline())
                .collect(Collectors.toList());
        System.out.println("Ponizej lista zadan ktorych dedliny konczą się jutro");
        System.out.println(dedlines);
        System.out.println(dedlines.size());

    }


}
