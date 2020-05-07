package com.kodilla.optional.homework;

import java.util.Objects;

public class Teacher {

    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public Teacher(String name) {
        this.name = name;
    }
}
