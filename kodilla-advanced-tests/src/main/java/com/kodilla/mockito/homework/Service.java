package com.kodilla.mockito.homework;

import java.util.*;

public class Service {

    Map<Location, List<User>> userLocationMap = new HashMap();
//    private User user;
//    private List<User> users = new ArrayList<>();

    public void addUserAndLocation(Location location, User user) {

//        this.userLocationMap.computeIfAbsent(location, k -> users).add(user); // hmmm
        userLocationMap.putIfAbsent(location, new ArrayList<>());
        userLocationMap.get(location).add(user);
    }

    public void sendNotificationToAll(Notification notification) {
        this.userLocationMap
                .forEach((location, users) -> users.forEach(user -> user.receive(notification)));

//        userLocationMap.values().stream().forEach(users -> users.forEach(user -> user.receive(notification)));

//        userLocationMap.values()
//                .stream()
//                .flatMap(Collection::stream)
//                .distinct()
//                .forEach(user -> user.receive(notification));
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

    public void sendNotificationToLocation(Location location, Notification notification) {
//        userLocationMap.entrySet()
//                .stream()
//                .filter(entry -> entry.getKey().equals(location))
//                .findFirst()
//                .get()
//                .getValue()
//                .forEach(user -> user.receive(notification));

//        userLocationMap.getOrDefault(location, new ArrayList<>()).forEach(user -> user.receive(notification));

//        List userFromLocation = userLocationMap.get(location);
//        if (userFromLocation != null) {
//            userFromLocation.forEach();
//        }

        if (userLocationMap.containsKey(location)) {
            userLocationMap.get(location).forEach(user -> user.receive(notification));
        }
    }
}


