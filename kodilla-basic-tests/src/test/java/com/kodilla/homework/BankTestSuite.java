package com.kodilla.homework;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateAllSaldo() {
        CashMachine cashMachine1 = new CashMachine("Test1");
        CashMachine cashMachine2 = new CashMachine("Test2");
        cashMachine1.add(10);
        cashMachine2.add(20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank testowy = new Bank("testowy", (cashMachines));
        assertEquals(30, testowy.sumAll());
    }

    @Test
    public void shouldCalculatePayoffCount() {
        CashMachine cashMachine1 = new CashMachine("Test1");
        CashMachine cashMachine2 = new CashMachine("Test2");
        cashMachine1.add(-10);
        cashMachine1.add(-10);
        cashMachine1.add(10);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(-20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank testowy = new Bank("testowy", (cashMachines));
        assertEquals(3, testowy.getCountPayoffBank());
    }

    @Test
    public void shouldCalculatePaymentCount() {
        CashMachine cashMachine1 = new CashMachine("Test1");
        CashMachine cashMachine2 = new CashMachine("Test2");
        cashMachine1.add(-10);
        cashMachine1.add(-10);
        cashMachine1.add(10);
        cashMachine1.add(10);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(-20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank testowy = new Bank("testowy", (cashMachines));
        assertEquals(5, testowy.getCountPaymentBank());
    }

    @Test
    public void shouldCalculateAveragePayoff() {
        CashMachine cashMachine1 = new CashMachine("Test");
        CashMachine cashMachine2 = new CashMachine("Test");
        cashMachine1.add(100);
        cashMachine1.add(100);
        cashMachine1.add(-100);
        cashMachine1.add(50);
        cashMachine2.add(-100);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank testowy = new Bank("testowy", (cashMachines));
        Assert.assertEquals(-100, testowy.getAvgPayOfftBank(), 0.001);


    }

    @Test
    public void shouldCalculateAveragePayment() {
        CashMachine cashMachine1 = new CashMachine("Test");
        CashMachine cashMachine2 = new CashMachine("Test");
        cashMachine1.add(100);
        cashMachine1.add(100);
        cashMachine2.add(100);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank testowy = new Bank("testowy", (cashMachines));
        Assert.assertEquals(100, testowy.getAvgPaymentBank(), 0.001);


    }

}