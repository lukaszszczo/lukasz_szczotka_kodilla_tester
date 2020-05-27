package com.kodilla.spring.basic.dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.MessageService;

public class SimpleApplication {

    //private MessageService messageService = new MessageService();

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}