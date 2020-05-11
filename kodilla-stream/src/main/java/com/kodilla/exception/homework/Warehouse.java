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

        List<Order> getOrders = orders // tworze nową liste tymczasową getOrders
                .stream()  // uruchamiam strumien
                .filter(u -> u.getNumber().contains(number))  // pobieram getNumber i  sprawdza booleanem czy zawiera number, true przechodzi dalej , false nie
                .collect(Collectors.toList()); // zbieramy to co przeszlo przez strumien do listy getOrders

        if (getOrders.isEmpty()) {
            throw new OrderDoesntExistException();
        }// jezeli nie znajdzie mi takiego zamowienia to wyrzuca wyjatek, Lista bedzie 1 elementowa


        System.out.println("Zamówienie o numerze:  " + getOrders.get(0).getNumber() + " znajduje sie na liscie!");


        return getOrders.get(0); // index 0 bo mamy tylko 1 zamowienie zwracac
    }


}

