package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService,notificationService);

        shippingCenter.sendPackage("Hill Street 11, New York", 17.2);
        shippingCenter.sendPackage("test, testk", 31.2);
    }
}