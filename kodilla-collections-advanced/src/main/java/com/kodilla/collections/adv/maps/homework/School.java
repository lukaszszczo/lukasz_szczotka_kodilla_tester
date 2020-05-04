package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class School {

    private String schoolName;


    private List<Integer> studentList = new ArrayList<>(); // wrappery typów prymitywnych int a Integer - musze poczytac

    public School(String schoolName, Integer... studentList) {
        this.schoolName = schoolName;
//        for (int numberOfStudent : studentList)
//            this.studentList.add(numberOfStudent);

        this.studentList = asList(studentList);

        Integer i = 1;

        List<Integer> myList = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            myList.add(j);
        }


    }

    @Override
    public String toString() {
        return schoolName;
    }

    public int sumStudent() {
        int sum = 0;
        for (int numberOfStudent : studentList) {
            sum += numberOfStudent;
        }

        return sum;
    }

    public int getSize() {
        return studentList.size();
    }

}
