package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();


    @Test
    @NullAndEmptySource
    public void shouldAddNewOrder() { // kassuje przygtowana wczesniej baze, dodaje i sprawdzam czy nie jest pusta

        shop.shopList.clear();
        shop.addOrder(new Order("test",of(2019,6,12),555));
        assertTrue(!shop.shopList.isEmpty());

    }

    @Test
    public void shouldGetMinOrderValue() throws Exception {

        Double minResult = shop.getMinOrder();
        assertEquals(32.0,minResult);

    }

    @Test
    @NullAndEmptySource
    public void shouldGetMaxOrderValue() throws Exception {

        Double maxResult = shop.getMaxOrder();
        assertEquals(798.0,maxResult);

    }
    @Test
    public void shouldGetFromTwoYearsOrders(){

        assertEquals(3,shop.getOrdersFromTwoYears().size());

    }
    @Test
    public void shouldGetCorrectNumbersOfOrders(){

        assertEquals(7, shop.getNumberOfOrders());

    }

    @Test
    public void shouldGetCorrectSumOfValue(){
              assertEquals(1917, shop.getSumOrders());

    }



    @BeforeEach
    public void initializeShop() {
        shop.addOrder(new Order("adam", of(2020, 5, 15), 78));
        shop.addOrder(new Order("bodzio", of(2019, 5, 15), 234));
        shop.addOrder(new Order("sad", of(2018, 5, 15), 798));
        shop.addOrder(new Order("qwerty", of(2019, 5, 15), 100));
        shop.addOrder(new Order("lukasz", of(2013, 5, 15), 587));
        shop.addOrder(new Order("ktos", of(2012, 5, 15), 88));
        shop.addOrder(new Order("ala", of(2011, 5, 15), 32));
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}