package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Shop {

    private List<Order> shopList = new ArrayList<>();


    public void addOrder(Order order) {
        shopList.add(order);
    }


    public List<Order> getOrdersBetween(LocalDate startDate, LocalDate endDate) {
        return shopList
                .stream()
                .filter(u -> u.getDate().isAfter(startDate.minusDays(1)))
                .filter(u -> u.getDate().isBefore(endDate.plusDays(1)))
                .collect(toList());

    }

    public List<Order> getValueBetween(double minValue, double maxValue) {
        return shopList
                .stream()
                .filter(u -> u.getValue() >= minValue)
                .filter(u -> u.getValue() <= maxValue)
                .sorted(Comparator.comparingDouble(Order::getValue))
                .collect(toList());
    }


    public double getMinOrder() {
        return shopList
                .stream()
                .mapToDouble(Order::getValue)
                .min()
                .orElse(0.0d);
    }

    public double getMaxOrder() {

        return shopList
                .stream()
                .max(Comparator.comparingDouble(Order::getValue))
                .map(Order::getValue)
                .get();
    }

    public int getNumberOfOrders() {
        return shopList.size();
    }

    public double getSumOrders() {
        return shopList
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}


