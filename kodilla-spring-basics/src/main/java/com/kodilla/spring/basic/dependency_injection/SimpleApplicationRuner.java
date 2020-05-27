package com.kodilla.spring.basic.dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.FacebookMessageService;
import com.kodilla.spring.basic.spring_dependency_injection.MessageService;

public class SimpleApplicationRuner {

    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}