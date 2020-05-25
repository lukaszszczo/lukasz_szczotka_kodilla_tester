package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {

    private User user;

    private List<User> users = new ArrayList<>();
    private Map<Location, List<User>> userLocationMap = new HashMap();


    public void addUserAndLocation(Location location, User user) {

        this.userLocationMap.computeIfAbsent(location, k -> users).add(user); // hmmm

    }

    public void sendNotificationToAll(Notification notification) {
        this.userLocationMap.forEach((location, users) -> user.receive(notification));
    }

   /* public void deleteUserFromLocation(Location location, User user){
        this.userLocationMap.entrySet()
                .stream()
                .filter(location -> location.getKey().equals(location))
                .forEach();
    }*/

    public void removeUserFromMap(User user) {
        this.userLocationMap.remove(user);

    }

    public void sendNotificationToLocation(Location location) {
        userLocationMap.entrySet()
                .stream()
                .filter(user -> user.getValue().contains(location))
                .forEach(user -> user.getKey());


    }
}


