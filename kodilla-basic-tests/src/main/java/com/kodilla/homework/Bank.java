package com.kodilla.homework;

public class Bank {
    String bankName;
    CashMachine cashMachine[];

    public Bank(String bankName, CashMachine cashMachines[]) {
        this.bankName = bankName;
        this.cashMachine = cashMachines;
    }

    public int sumAll() {
        int sumAll = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sumAll = sumAll + cashMachine[i].getSum();
        }

        return sumAll;
    }

    public int getCountBank() {  // metoda zwraca ilosc transakcji z wszystkich bankomatów
        int countBank = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            countBank += cashMachine[i].getCount();
        }
        return countBank;
    }

    public double getAvgPaymentBank() {  // metoda zwraca srednia wartosc wplat w bankomatach
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getCount() == 0) {
                return 0;
            }
        }

        double AvgPaymentBank = 0;

        for (int i = 0; i < cashMachine.length; i++)
            AvgPaymentBank += cashMachine[i].getPaymentAvg() / cashMachine.length;
        return AvgPaymentBank;
    }

    public double getAvgPayOfftBank() {  // metoda zwraca srednia wartosc wyplat w bankomatach
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getCount() == 0) {
                return 0;
            }
        }

        double AvgPayOffBank = 0;

        for (int i = 0; i < cashMachine.length; i++)
            AvgPayOffBank += cashMachine[i].getPayoffAvg() / cashMachine.length;
        return AvgPayOffBank;
    }

    public int getCountPaymentBank() { // zwraca ilosc wplat
        int paymentBank = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            paymentBank += cashMachine[i].getPayment();
        }
        return paymentBank;
    }

    public int getCountPayoffBank() { // zwraca ilosc wyplat
        int payoffBank = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            payoffBank += cashMachine[i].getPayoff();
        }
        return payoffBank;
    }

}







