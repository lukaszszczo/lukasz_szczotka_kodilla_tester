package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;


    private List<Integer> studentList = new ArrayList<>(); // wrappery typów prymitywnych int a Integer - musze poczytac

    public School(String schoolName, int... studentList) {
        this.schoolName = schoolName;
        for (int numberOfStudent : studentList)
            this.studentList.add(numberOfStudent);

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
