package com.kodilla.homework;

public class Bank {

    CashMachine ing;
    CashMachine santander;
    CashMachine pko;


    public Bank() {
        this.ing = new CashMachine();
        this.santander = new CashMachine();
        this.pko = new CashMachine();
    }

    public void addMoney(int money) {
        if (money > 0) {
            this.ing.add(money);
        }


    }
}