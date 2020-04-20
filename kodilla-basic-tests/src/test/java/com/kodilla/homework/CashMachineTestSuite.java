package com.kodilla.school;

import com.kodilla.homework.CashMachine;
import com.kodilla.homework.Bank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine("test");
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine("test");
        cashMachine.add(3242);
        cashMachine.add(-534532);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(3242, transactions[0]);
        assertEquals(-534532, transactions[1]);
    }

    @Test
    public void shouldGetSum() {
        CashMachine cashMachine = new CashMachine("test");
        cashMachine.add(2);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(-10);
        assertEquals(12, cashMachine.getSum());
    }

    @Test
    public void shouldGetExpectedNumberofTransactions() { // czy zgadza sie liczba transakcji
        CashMachine cashMachine = new CashMachine("TEst");
        cashMachine.add(656754);
        cashMachine.add(345634563);
        int[] transactions = cashMachine.getTransactions();

        assertEquals(2, transactions.length);

    }

    @Test
    public void shouldGetExpectedNumberoPayment() { // czy zgadza sie liczba wpłat
        CashMachine cashMachine = new CashMachine("Test");
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(34);
        cashMachine.add(35);
        cashMachine.add(32);
        assertEquals(3, cashMachine.getPayment());

    }

    @Test
    public void shouldGetExpectedNumberoPayoff() { // czy zgadza sie liczba wyłat
        CashMachine cashMachine = new CashMachine("Test");
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(34);
        cashMachine.add(35);
        cashMachine.add(32);
        assertEquals(4, cashMachine.getPayoff());

    }

    @Test
    public void averageShouldBeZeroIfCashmaschineDontHaveValue() {
        CashMachine cashMachine = new CashMachine("test");
        assertEquals(0, cashMachine.getPaymentAvg(), 0.0001);
    }

    @Test
    public void shouldCalculateCashmachineAveragePayment() {
        CashMachine cashMachine = new CashMachine("Test");
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(100);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(100);
        Assert.assertEquals(35.714, cashMachine.getPaymentAvg(), 0.001);
    }
    @Test
    public void shouldCalculateCashmachineAveragePayoff() {
        CashMachine cashMachine = new CashMachine("Test");
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-100);
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-100);
        Assert.assertEquals(-35.714, cashMachine.getPayoffAvg(), 0.001);
    }
}