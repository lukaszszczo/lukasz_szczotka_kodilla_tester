package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    List<Order> shopList = new ArrayList<>();


    public void addOrder(Order order) {
        shopList.add(order);
    }


    public List<Order> getOrdersBetween(LocalDate startDate, LocalDate endDate) {
                return shopList
                .stream()
                .filter(u -> u.getDate().isAfter(startDate))
                .filter(u -> u.getDate().isBefore(endDate))
                .collect(Collectors.toList());

    }

    public List<Order> getValueBetween(double minValue, double maxValue) {
        return shopList
                .stream()
                .filter(u -> u.getValue() >= minValue)
                .filter(u -> u.getValue() <= maxValue)
                .sorted(Comparator.comparingDouble(Order::getValue))
                .collect(Collectors.toList());

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


