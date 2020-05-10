package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse test = new Warehouse();
        test.addOrder(new Order("1"));
        test.addOrder(new Order("2"));
        test.addOrder(new Order("3"));
        test.addOrder(new Order("4"));
        test.addOrder(new Order("5"));
        test.addOrder(new Order("6"));


        System.out.println(test.getOrder("1"));

        for (Order temp : test.orders)
        System.out.println(temp.number);
    }
}
