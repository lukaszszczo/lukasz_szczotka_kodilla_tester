package com.kodilla.homework;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();                   // to mi sie nie podoba... że musze bank.pierwszy albo bank.cashmachines[0]
        Bank bank2 = new Bank();
        Bank bank3 = new Bank();


        bank.addTransaction(1);
        bank.addTransaction(-664356341);
        bank.addTransaction(1);
        bank.addTransaction(879791);
        bank.addTransaction(1);
        bank.addTransaction(1);
        bank.addTransaction(7);

                System.out.println("Saldo bankomatu " + bank.cashmachines[0].getSum());
        System.out.println("Ilosc wszystkich tranzakcji to " + bank.cashmachines[0].getCount());
        System.out.println("Ilosc wyplat to " + bank.cashmachines[0].getPayoff());
        System.out.println("Ilosc wpłat to " + bank.cashmachines[0].getPayment());
        System.out.println("Sredia wartosc wplat to " + bank.cashmachines[0].getPaymentAvg());
        System.out.println("Sredia wartosc wypłat to " + bank.cashmachines[0].getPayoffAvg());
        System.out.println(".........................................");

        bank2.addTransaction(10);
        bank2.addTransaction(-10);
        bank2.addTransaction(10);

        System.out.println("Saldo bankomatu " + bank2.cashmachines[1].getSum());
        System.out.println("Ilosc wszystkich tranzakcji to " + bank2.cashmachines[1].getCount());
        System.out.println("Ilosc wyplat to " + bank2.cashmachines[1].getPayoff());
        System.out.println("Ilosc wpłat to " + bank2.cashmachines[1].getPayment());
        System.out.println("Sredia wartosc wplat to " + bank2.cashmachines[1].getPaymentAvg());
        System.out.println("Sredia wartosc wplat to " + bank2.cashmachines[1].getPayoffAvg());
        System.out.println(".........................................");

        bank3.addTransaction(10);
        bank3.addTransaction(10);
        bank3.addTransaction(-1430);
        bank3.addTransaction(10);
        bank3.addTransaction(10);
        bank3.addTransaction(10);

        System.out.println("Saldo bankomatu " + bank3.cashmachines[2].getSum());
        System.out.println("Ilosc wszystkich tranzakcji to " + bank3.cashmachines[2].getCount());
        System.out.println("Ilosc wyplat to " + bank3.cashmachines[2].getPayoff());
        System.out.println("Ilosc wpłat to " + bank3.cashmachines[2].getPayment());
        System.out.println("Sredia wartosc wplat to " + bank3.cashmachines[2].getPaymentAvg());
        System.out.println("Sredia wartosc wplat to " + bank3.cashmachines[2].getPayoffAvg());
        System.out.println(".........................................");



    }

}
