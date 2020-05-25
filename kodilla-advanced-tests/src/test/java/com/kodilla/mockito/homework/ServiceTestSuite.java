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
    public void shouldAddUserToNewLocation() {
        // When
        service.addUserAndLocation(location, user);
        // Then
        assertEquals(1, service.userLocationMap.size());
    }

    @Test
    public void shouldAddUserToExistingLocation() {
        // Given
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        service.addUserAndLocation(location, user_1);
        // When
        service.addUserAndLocation(location, user_2);
        // Then
        assertEquals(1, service.userLocationMap.size());
    }

    @Test
    public void shouldReceiveNotificationForLocation() {
        // Given
        service.addUserAndLocation(location, user);
        // When
        service.sendNotificationToLocation(location, notification);
        // Then
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }

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
        service.sendNotificationToLocation(location_1, notification);

        Mockito.verify(user_1, Mockito.times(1)).receive(notification);


    }


    @Test
    public void shouldDeleteLocation() {

    }


}