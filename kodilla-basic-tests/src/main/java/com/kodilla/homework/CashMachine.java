package com.kodilla.homework;


public class CashMachine {
    private String name;
    private int[] transactions;
    private int transactionCount;
    private int payment; // wplata
    private int payoff; //wyplata


    public CashMachine(String name) {
        this.transactionCount = 0;
        this.transactions = new int[0];
        this.name = name;
    }

    public void add(int value) { // dodanie do tablicy zabrane z cwiczenia
        this.transactionCount++;
        int[] newTab = new int[this.transactionCount];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.transactionCount - 1] = value;
        this.transactions = newTab;
        if (value > 0) {
            payment++;
        } else {
            payoff++;
        }
    }

    public double getPaymentAvg() { // zwraca srednia wplat
        if (this.transactions.length == 0) {
            return 0;
        }

        double avgPayment = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (this.transactions[i] > 0) {
                avgPayment = avgPayment + this.transactions[i];
            }
        return avgPayment / this.payment;
    }

    public double getPayoffAvg() { // zwraca srednia wyplat
        if (this.transactions.length == 0) {
            return 0;
        }
        double avgPayoff = 0;
        for (int i = 0; i < this.transactions.length; i++)
            if (this.transactions[i] < 0) {
                avgPayoff = avgPayoff + this.transactions[i];
            }
        return avgPayoff / this.payoff;
    }


    public int[] getTransactions() { // uzyta w testach
        return transactions;
    }

    public int getSum() { // zwraca sume
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getCount() {      // zwraca wielkosc tablicy wiec tez i ilosc transakcji.
        return this.transactions.length;
    }


    public int getPayment() { // zwraca ilosc wplat
        return payment;
    }

    public int getPayoff() { //zwraca ilosc wyplat
        return payoff;
    }

    public String getName() {
        return name;
    }


}