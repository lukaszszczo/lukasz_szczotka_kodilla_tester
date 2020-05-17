package com.kodilla.mockito.homework;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestSuite {

    @Test
    public void notificationShouldSentToUser(){
        Service service = new Service();
        User user = Mockito.mock(User.class);
        Notification notification = Mockito.mock(Notification.class);


    }

}