package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {

        BookManager book = new BookManager();

        book.createBook("Król Lew", "Tomasz");
        book.createBook("Metro", "Dawid");
        book.createBook("Kosmos", "Adam");
        book.createBook("Król Lew", "Tomasz");


        System.out.println(book.bookList.get(0) == book.bookList.get(3)); // false
        System.out.println(book.bookList.get(0).equals(book.bookList.get(3))); // true

        for (Book temp : book.bookList) {
            System.out.println("Tytuł to: " + temp.getTitle() + ", " + " Autor to: " + temp.getAuthor() + " hashCode to: " + temp.hashCode()
                    + "\n---------------------------------------------------------------------");
        }


    }
}
