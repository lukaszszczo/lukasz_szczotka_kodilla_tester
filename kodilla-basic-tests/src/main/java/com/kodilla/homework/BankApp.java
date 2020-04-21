package com.kodilla.homework;

public class BankApp {
    public static void main(String[] args) {

        CashMachine first = new CashMachine("Bankomat pierwszy");

        first.add(10);
        first.add(10);
        first.add(10);
        first.add(-75);


        System.out.println("Nazwa bankomatu: " + first.getName());
        System.out.println("Saldo bankomatu: " + first.getSum());
        System.out.println("Ilosc wszystkich tranzakcji to: " + first.getCount());
        System.out.println("Ilosc wyplat to: " + first.getPayoff());
        System.out.println("Ilosc wpłat to: " + first.getPayment());
        System.out.println("Sredia wartosc wplat to: " + first.getPaymentAvg());
        System.out.println("Sredia wartosc wypłat to: " + first.getPayoffAvg());
        System.out.println(".........................................");


        CashMachine second = new CashMachine("To bedzie drugi bankomat");
        second.add(50);
        second.add(50);
        second.add(50);
        second.add(-1000);


        System.out.println("Nazwa bankomatu: " + second.getName());
        System.out.println("Saldo bankomatu: " + second.getSum());
        System.out.println("Ilosc wszystkich tranzakcji to: " + second.getCount());
        System.out.println("Ilosc wyplat to: " + second.getPayoff());
        System.out.println("Ilosc wpłat to: " + second.getPayment());
        System.out.println("Sredia wartosc wplat to: " + second.getPaymentAvg());
        System.out.println("Sredia wartosc wypłat to: " + second.getPayoffAvg());
        System.out.println(".........................................");

        CashMachine[] cashMachines = new CashMachine[]{first, second}; // utworzenie tablicy bankomatów i przypisanie w 0 i 1 dwoch bankomatow


        Bank pko = new Bank("PKO", (cashMachines));
        System.out.println("W banku: " + pko.bankName + " ilosc bankomatow to: " + pko.cashMachine.length); // ok zgadza sie ma przypisane dwa bankomaty.
        System.out.println("Saldo całkowite dla Banku: " + pko.bankName + " to " + pko.sumAll());
        System.out.println("ilość transakcji z wszystkich bankomatów " + pko.bankName + " to: " + pko.getCountBank());
        System.out.println("Srednia wartość wpłaty w  " + pko.bankName + " to " + pko.getAvgPaymentBank());
        System.out.println("Srednia wartość wypłaty w  " + pko.bankName + " to " + pko.getAvgPayOfftBank());
        System.out.println("liczba transakcji związanych z wpłatą " + pko.getCountPaymentBank());
        System.out.println("liczba transakcji związanych z wypłatą " + pko.getCountPayoffBank());


    }

}
