package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {

        BookManager book = new BookManager();

        book.createBook("Król Lew", "Tomasz");
        book.createBook("Metro", "Dawid");
        book.createBook("Kosmos", "Adam");
        book.createBook("Król Lew", "Tomasz");


        //System.out.println(book.bookList.get(0) == book.bookList.get(3)); // false
        //System.out.println(book.bookList.get(0).equals(book.bookList.get(3))); // true

        System.out.println(book.bookList.get(0));
        System.out.println(book.bookList.get(1));
        System.out.println(book.bookList.get(2));
        System.out.println(book.bookList.get(3));
        System.out.println(book.bookList.get(4));


        for (Book temp : book.bookList.values()) {
            System.out.println("Tytuł to: " + temp.getTitle() + ", " + " Autor to: " + temp.getAuthor() + " Identity hashCode to: " + System.identityHashCode(temp) + " a HashCode to " + temp.hashCode()
                    + "\n---------------------------------------------------------------------");
        }


    }
}
