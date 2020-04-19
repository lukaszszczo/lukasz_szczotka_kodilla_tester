package com.kodilla.school;

import com.kodilla.homework.CashMachine;
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
}