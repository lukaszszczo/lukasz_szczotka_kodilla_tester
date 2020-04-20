package com.kodilla.homework;

public class Bank {

    CashMachine Pierwszy = new CashMachine("Pierwszy Bankomat");
    CashMachine Drugi = new CashMachine("Drugi Bankomat");
    CashMachine Trzeci = new CashMachine("Trzeci Bankomat");


    CashMachine[] cashmachines = new CashMachine[]{Pierwszy, Drugi, Trzeci};



    public void addTransaction(int money) {
        this.cashmachines[0].add(money);
        this.cashmachines[1].add(money);
        this.cashmachines[2].add(money);




    }

    }






