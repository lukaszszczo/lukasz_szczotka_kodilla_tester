package com.kodilla.mockito.homework;

import java.util.*;

public class Service {


    Map<Location, List<User>> userLocationMap = new HashMap();


    public void addUserAndLocation(Location location, User user) {

        userLocationMap.putIfAbsent(location, new ArrayList<>());
        userLocationMap.get(location).add(user);
    }

    public void sendNotificationToAll(Notification notification) {
        this.userLocationMap
                .forEach((location, users) -> users.forEach(user -> user.receive(notification)));
    }


    public void removeUserFromSubscribeList(User user) {
        userLocationMap.values().remove(user);


    }

    public void removeUserFromSubscribeList_2(User user) {
        for (List<User> users : userLocationMap.values()) {
            users.remove(user);
        }


    }



    public void removeLocation(Location location) {
        if (userLocationMap.containsKey(location)) {
            userLocationMap.remove(location);
        }


    }

    public void removeUserFromOneLocation(Location location, User user){
        for (Map.Entry<Location, List<User>> temp : userLocationMap.entrySet()) {
            if (temp.getKey().equals(location)) {
                temp.getValue().remove(user);
            }
        }

    }
    public void removeUserFromOneLocation_2(Location location, User user){
        if (userLocationMap.containsKey(location)) {

            if(userLocationMap.get(location).contains(user)) {
               userLocationMap.get(location).remove(user);
            }

        }


    }




    public void sendNotificationToLocation(Location location, Notification notification) {

        if (userLocationMap.containsKey(location)) {
            userLocationMap.get(location).forEach(user -> user.receive(notification));
        }
    }


}




