package com.kodilla.mockito.homework;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestSuite {

    Service service = new Service();
    User user = Mockito.mock(User.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);


    @Test
    public void shoudGetNotoficationUserSignedUp() {
        service.addUserAndLocation(location, user);

        service.sendNotificationToAll(notification);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shoudNotGetNotoficationUserNotSignedUp() {

        service.sendNotificationToAll(notification);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }


    @Test
    public void shouldDeleteUserFromOneLocation() {

    }

    @Test
    public void shouldDeleteUserFromAllLocation() {
        service.removeUserFromMap(user);
        Mockito.verify(user, Mockito.never()).receive(notification);

    }

    @Test
    public void shouldGetNotificationInSpecificLocation() {
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        service.addUserAndLocation(location_1, user_1);
        service.addUserAndLocation(location_2, user_2);
        service.sendNotificationToLocation(location_1);

        Mockito.verify(user_1, Mockito.times(1)).receive(notification);


    }


    @Test
    public void shouldDeleteLocation() {

    }


}