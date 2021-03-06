package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.awt.image.IndexColorModel;
import java.time.LocalDate;
import java.util.List;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private static final double MINIMUM_ORDER_VALUE = 32.0;
    private static final double MAXIMUM_ORDER_VALUE = 798;
    Shop shop = new Shop();


    @Test
    public void shouldAddNewOrder() {
        Shop shop = new Shop();
        shop.addOrder(new Order("test", of(2019, 6, 12), 555));
        assertEquals(1,shop.getNumberOfOrders());
    }

    @Test
    public void shouldGetMinOrderValue() throws Exception {
        Double minResult = shop.getMinOrder();
        assertEquals(MINIMUM_ORDER_VALUE, minResult);
    }

    @Test
    @NullAndEmptySource
    public void shouldGetMaxOrderValue() throws Exception {
        Double maxResult = shop.getMaxOrder();
        assertEquals(MAXIMUM_ORDER_VALUE, maxResult);
    }

    @Test
    public void shouldGetFromTwoYearsOrders() {

        int result = shop.getOrdersBetween(LocalDate.of(2018, 5, 5), LocalDate.of(2020, 5, 5)).size();

        assertEquals(3, result);

    }

    @Test
    public void shouldGetZeroOrdersMaxDate() {
        // given
        LocalDate startDate = of(2020, 5, 15);
        LocalDate endDate = of(2021, 5, 16);
        // when

        List<Order> orders = shop.getOrdersBetween(startDate, endDate);
        // then
        for (Order order : orders){
            assertTrue(order.getDate().isAfter(startDate));
            assertTrue(order.getDate().isBefore(endDate));

        }
        System.out.println(orders.size());
        assertTrue(orders.size() == 0);

    }

    @Test
    public void shouldGetZeroOrdersMinDate() {
        // given
        LocalDate startDate = of(2010, 5, 15);
        LocalDate endDate = of(2011, 5, 15);
        // when

        List<Order> orders = shop.getOrdersBetween(startDate, endDate);
        // then
        for (Order order : orders){
            assertTrue(order.getDate().isAfter(startDate));
            assertTrue(order.getDate().isBefore(endDate));

        }
        System.out.println(orders.size());
        assertTrue(orders.size() == 0);

    }

    @Test
    public void shouldGetOrdersDateRange() {
        // given
        LocalDate startDate = of(2019, 5, 14);
        LocalDate endDate = of(2020, 5, 16);
        // when

        List<Order> orders = shop.getOrdersBetween(startDate, endDate);
        // then
        for (Order order : orders){
            assertTrue(order.getDate().isAfter(startDate.minusDays(1)));
            assertTrue(order.getDate().isBefore(endDate.plusDays(1)));

        }
        System.out.println(orders.size());
        assertTrue(orders.size()== 2);

    }


    @Test
    public void shouldGetCorrectNumbersOfOrders() {

        assertEquals(7, shop.getNumberOfOrders());

    }

    @Test
    public void shouldGetCorrectSumOfValue() {
        assertEquals(1917, shop.getSumOrders());

    }

    @Test
    public void shouldGetValueBetween() {

        int result = shop.getValueBetween(78, 100).size();
        assertEquals(3, result);

    }

    @Test
    public void shouldGetCorrectSetValueBetween() {

        List<Order> result = shop.getValueBetween(78, 100);

        for (Order temp : result) {
            System.out.println(temp.getValue());
        }

        assertEquals(78, result.get(0).getValue());
        assertEquals(88, result.get(1).getValue());
        assertEquals(100, result.get(2).getValue());

    }
    @Test
    public void shouldGetCorrectSetValueBetween_ZeroOrdersMin()  {

        List<Order> result = shop.getValueBetween(0, 31);

        for (Order temp : result) {
            System.out.println(temp.getValue());
        }

        assertTrue(result.isEmpty());

    }

    @Test
    public void shouldGetCorrectSetValueBetween_ZeroOrdersMax()  {

        List<Order> result = shop.getValueBetween(799, 23132);

        for (Order temp : result) {
            System.out.println(temp.getValue());
        }

        assertTrue(result.isEmpty());

    }

    @Test
    public void shouldGetEmptyList() {

        List<Order> result = shop.getOrdersBetween(LocalDate.of(2021, 5, 15), LocalDate.of(2022, 5, 15));
        assertTrue(result.isEmpty());

    }

    @Test
    public void shouldGetEmptyListError(){

    }


    @BeforeEach
    public void initializeShop() {
        shop.addOrder(new Order("adam", of(2020, 5, 15), 78));
        shop.addOrder(new Order("bodzio", of(2019, 5, 15), 234));
        shop.addOrder(new Order("sad", of(2018, 5, 15), 798));
        shop.addOrder(new Order("qwerty", of(2019, 4, 15), 100));
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