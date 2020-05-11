package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {


    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }


    public Order getOrder(String number) throws OrderDoesntExistException {

        return orders // tworze nową liste tymczasową getOrders
                .stream()  // uruchamiam strumien
                .filter(u -> u.getNumber().equals(number))  // pobieram getNumber i  sprawdza booleanem czy zawiera number, true przechodzi dalej , false nie
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
    }

}

