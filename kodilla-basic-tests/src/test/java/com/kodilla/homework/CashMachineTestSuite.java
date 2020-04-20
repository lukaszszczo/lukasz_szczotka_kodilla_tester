package com.kodilla.school;

import com.kodilla.homework.CashMachine;
import com.kodilla.homework.Bank;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(3242);
        cashMachine.add(-534532);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(3242, transactions[0]);
        assertEquals(-534532, transactions[1]);
    }

    @Test
    public void shouldGetSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(-10);
        assertEquals(12, cashMachine.getSum());
    }

    @Test
    public void shouldGetExpectedNumberofTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(656754);
        cashMachine.add(345634563);
        int[] transactions = cashMachine.getTransactions();

        assertEquals(2, transactions.length);

    }
}