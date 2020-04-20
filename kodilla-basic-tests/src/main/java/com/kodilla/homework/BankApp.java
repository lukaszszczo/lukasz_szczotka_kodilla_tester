package com.kodilla.homework;

public class BankApp {
    public static void main(String[] args) {

        CashMachine first = new CashMachine("Bankomat pierwszy");

        first.add(500);
        first.add(-500);
        first.add(500);

        System.out.println("Nazwa bankomatu: " + first.getName());
        System.out.println("Saldo bankomatu: " + first.getSum());
        System.out.println("Ilosc wszystkich tranzakcji to: " + first.getCount());
        System.out.println("Ilosc wyplat to: " + first.getPayoff());
        System.out.println("Ilosc wpłat to: " + first.getPayment());
        System.out.println("Sredia wartosc wplat to: " + first.getPaymentAvg());
        System.out.println("Sredia wartosc wypłat to: " + first.getPayoffAvg());
        System.out.println(".........................................");


        CashMachine second = new CashMachine("To bedzie drugi bankomat");
        second.add(1000);
        second.add(-1000);
        second.add(3000);
        second.add(-1000);
        second.add(10000);
        second.add(1000);

        System.out.println("Nazwa bankomatu: " + second.getName());
        System.out.println("Saldo bankomatu: " + second.getSum());
        System.out.println("Ilosc wszystkich tranzakcji to: " + second.getCount());
        System.out.println("Ilosc wyplat to: " + second.getPayoff());
        System.out.println("Ilosc wpłat to: " + second.getPayment());
        System.out.println("Sredia wartosc wplat to: " + second.getPaymentAvg());
        System.out.println("Sredia wartosc wypłat to: " + second.getPayoffAvg());
        System.out.println(".........................................");


        CashMachine[] cashMachines = new CashMachine[]{first, second}; // utworzenie tablicy bankomatów i przypisanie w 0 i 1 dwoch bankomatow

        Bank pko = new Bank("Bank PKO!"); // utworzenie banku1
        Bank ing = new Bank("Bank ING!"); // utworzenie banku2

        Bank[] banks = new Bank[]{pko, ing}; // mam tablice z dwoma bankami


        /*banks[0] = first;  ----------        takie wynalazki mi nie przechodza.
        Bank[] banks = new Bank[]{first};
        Bank[] banks = new Bank[]{first};
*/
    }

}
