package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService dhlService = new DhlService();
        NotificationService emailService = new EmailService();
        ShippingCenter shippingCenter = new ShippingCenter(dhlService, emailService);

        shippingCenter.sendPackage("Hill Street 11, New York", 17.2);
        shippingCenter.sendPackage("test, testk", 31.2);
    }
}