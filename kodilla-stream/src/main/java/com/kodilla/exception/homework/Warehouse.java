package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {


    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }


    public Order getOrder(String number) throws OrderDoesntExistException {

        Optional<Order> optionalOrder = orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                /*.orElseThrow(new OrderDoesntExistException()) -? czemu :(*/;

        if (!optionalOrder.isPresent()) {
            throw new OrderDoesntExistException();
        }
        return optionalOrder.get();
    }


}

