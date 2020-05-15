package com.kodilla.execution_model;

public class Item {

    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
