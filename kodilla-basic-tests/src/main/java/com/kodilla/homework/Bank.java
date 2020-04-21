package com.kodilla.homework;

public class Bank {
        String bankName;
        CashMachine cashMachine[];

    public Bank(String bankName, CashMachine cashMachines[]) {
        this.bankName = bankName;
        this.cashMachine = cashMachines;
    }
    public int sumAll(){
        int sumAll = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sumAll = sumAll + cashMachine[i].getSum();
        }

      return sumAll;
    }

    }








