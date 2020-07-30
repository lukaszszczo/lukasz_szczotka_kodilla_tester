package com.kodilla.mockito.homework;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
    public void shouldReceiveNotificationFromLocation() {
        // Given
        User user_1 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        service.addUserAndLocation(location, user);
        service.addUserAndLocation(location_1, user_1);
        service.addUserAndLocation(location_2, user_1);
        // When
        service.sendNotificationToLocation(location_1, notification);
        // Then
        Mockito.verify(user_1, Mockito.times(1)).receive(notification);
    }


    @Test
    public void shoudNotGetNotoficationUserNotSignedUp() {
        // then
        service.sendNotificationToAll(notification);
        // when
        Mockito.verify(user, Mockito.never()).receive(notification);
    }


    @Test
    public void shouldDeleteUserFromAllLocation() {
        // Given
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        User user_3 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        service.addUserAndLocation(location_1, user_1);
        service.addUserAndLocation(location_2, user_1);
        service.addUserAndLocation(location_1, user_2);
        service.addUserAndLocation(location_1, user_3);
        service.addUserAndLocation(location_2, user_2);

        //When
        service.removeUserFromSubscribeList_2(user_1);
        service.sendNotificationToAll(notification);

        //Then
        assertEquals(2,service.userLocationMap.size());
        Mockito.verify(user_1, Mockito.never()).receive(notification);
        Mockito.verify(user_3, Mockito.times(1)).receive(notification);

    }
    @Test
    public void shouldDeleteFromLocation(){
        //given
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        Location location_3 = Mockito.mock(Location.class);
        Location location_4 = Mockito.mock(Location.class);
        service.addUserAndLocation(location_1, user_1);
        service.addUserAndLocation(location_2, user_2);
        service.addUserAndLocation(location_3, user_2);
        service.addUserAndLocation(location_4, user_2);

        //when
        service.removeLocation(location_2);


        //then
        assertEquals(3,service.userLocationMap.size());




    }

    @Test
    public void shouldGetNotificationInSpecificLocation() {
        // given
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        service.addUserAndLocation(location_1, user_1);
        service.addUserAndLocation(location_2, user_2);

        // when
        service.sendNotificationToLocation(location_1, notification);
         // then
        Mockito.verify(user_1, Mockito.times(1)).receive(notification);


    }


    @Test
    public void shouldDeleteUserFromOneLocation() {
        // given
        User user_1 = Mockito.mock(User.class);
        User user_2 = Mockito.mock(User.class);
        User user_3 = Mockito.mock(User.class);
        Location location_1 = Mockito.mock(Location.class);
        Location location_2 = Mockito.mock(Location.class);
        Location location_3 = Mockito.mock(Location.class);
        service.addUserAndLocation(location_1,user_1);
        service.addUserAndLocation(location_2,user_1);
        service.addUserAndLocation(location_3,user_3);

        // then
        service.removeUserFromOneLocation_2(location_1,user_1);
        service.sendNotificationToLocation(location_1, notification);


        // when

        Mockito.verify(user_1,Mockito.never()).receive(notification);

    }


}