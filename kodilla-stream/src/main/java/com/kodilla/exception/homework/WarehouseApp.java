package com.kodilla.exception.homework;

import java.io.IOException;
import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse test = new Warehouse();
        test.addOrder(new Order("1"));
        test.addOrder(new Order("2"));
        test.addOrder(new Order("3"));
        test.addOrder(new Order("4"));
        test.addOrder(new Order("5"));
        test.addOrder(new Order("6"));
        test.addOrder(new Order("7"));
        test.addOrder(new Order("8"));
        test.addOrder(new Order("9"));


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Podaj nr zamowienia od 1 do 9 lub x aby zakonczyc");
            String s = scanner.nextLine();

            if (s.equalsIgnoreCase("x")){
                break;
            }

            try {
                test.getOrder(s); //szuakmy zamowienia wpisanego
                System.out.println("Znaleziono zamówienie!!");
            } catch (OrderDoesntExistException e) {
                System.out.println("Nie ma takiego zamówienia!!");
                System.out.println("Proszę o ponowane podanie numeru");
            } finally {
                System.out.println("Dziękuje");
            }


        }


    }
}
