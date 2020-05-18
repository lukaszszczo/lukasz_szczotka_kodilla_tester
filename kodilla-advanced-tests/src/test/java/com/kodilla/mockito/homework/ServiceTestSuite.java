package com.kodilla.mockito.homework;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestSuite {

    @Test
    public void shoudGetnotoficationUserSignedUp(){
        Service service = new Service();
        User user = Mockito.mock(User.class);
        Notification notification = Mockito.mock(Notification.class);
        Location location = Mockito.mock(Location.class);

        service.map.put(user,location);




    }
    @Test
    public void shouldNotGetNotoficationUserNotSignedUp(){

    }
    @Test
    public void shouldDeleteUserFromOneLocation() {

    }

    @Test
    public void shouldDeleteUserFromAllLocation(){

    }
    @Test
    public void shouldGetNotificationInSpecificLocation(){
    }
    @Test
    public void shouldGetNotificationToAllUsers(){

    }
    @Test
    public void shouldDeleteLocation(){

    }


}