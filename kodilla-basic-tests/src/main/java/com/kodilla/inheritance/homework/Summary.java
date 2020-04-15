package com.kodilla.inheritance.homework;

public class Summary {
    public static void main(String[] args) {
        Windows MSDOS = new Windows("MSDOS", 40);
        MSDOS.turnOn();
        System.out.println("System " + MSDOS.getName() + " wiek " + MSDOS.getAge());
        MSDOS.turnOf();

        Linux Debian = new Linux("Debian", 60);
        Debian.turnOn();
        System.out.println("System " + Debian.getName() + " wiek " + Debian.getAge());
        Debian.turnOf();
    }
}


