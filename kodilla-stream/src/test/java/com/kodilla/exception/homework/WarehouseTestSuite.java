package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void isOrderCorrectFound() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5"));
        //when
        warehouse.getOrder("5");
        // then
        assertEquals(warehouse.orders.get(0).getNumber(),warehouse.getOrder("5").getNumber());
        // hej za duzo pipcenia tu jest juz widze
    }

    @Test (expected = OrderDoesntExistException.class)
    public void isOrderCorrectFound_withException() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5"));
        //when
        warehouse.getOrder("99");
        // then
        assertEquals(warehouse.orders.get(0).getNumber(),warehouse.getOrder("5").getNumber());

    }




}