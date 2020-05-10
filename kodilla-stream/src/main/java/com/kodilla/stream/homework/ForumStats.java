package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostForForthyPlus = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average().orElse(0);
                //.getAsDouble();
        System.out.println("Srednia ilość postów dla Userów ponizej 40 roku to " + avgPostForForthyPlus + " postów");

        double avgPostForForthyMinus = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average().orElse(0);
               // .getAsDouble();
        System.out.println("Srednia ilość postów dla Userów ponizej 40 roku to " + avgPostForForthyMinus + " postów");


    }
}
