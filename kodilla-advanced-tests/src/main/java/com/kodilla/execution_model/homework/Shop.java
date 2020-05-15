package com.kodilla.execution_model.homework;

import java.io.NotActiveException;
import java.security.acl.NotOwnerException;
import java.time.Year;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> shopList = new HashSet<>();


    public void addOrder(Order order) {
        shopList.add(order);
    }


    public Set<Order> getOrdersFromTwoYears() {
        LocalDate currentDate = LocalDate.now();

        return shopList
                .stream()
                .filter(u -> u.getDate().isAfter(currentDate.minusYears(2)))
                .collect(Collectors.toSet());

    }

    public double getMinOrder() throws Exception {

        return shopList
                .stream()
                .min(Comparator.comparingDouble(Order::getValue))
                .map(u -> u.getValue())
                .get();

    }

    public double getMaxOrder() throws Exception {

        return shopList
                .stream()
                .max(Comparator.comparingDouble(Order::getValue))
                .map(u -> u.getValue())
                .get();


    }
    public int getNumberOfOrders() {
        return shopList.size();
    }

    public double getSumOrders(){
        double sum = 0;
        for (Order temp : shopList){
            sum += temp.getValue();
        }
      return sum;
    }
}


