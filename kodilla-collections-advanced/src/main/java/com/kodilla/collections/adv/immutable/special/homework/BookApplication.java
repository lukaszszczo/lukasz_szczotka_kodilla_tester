package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {

        BookManager book = new BookManager();

        Book book1 = book.createBook("Król Lew", "Tomasz");
        Book book2 = book.createBook("Metro", "Dawid");
        Book book3 = book.createBook("Kosmos", "Adam");
        Book book4 = book.createBook("Król Lew", "Tomasz");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println();
        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));
        System.out.println(System.identityHashCode(book3));
        System.out.println(System.identityHashCode(book4));


//        System.out.println(book.bookList.get(0) == book.bookList.get(3)); // false
//        System.out.println(book.bookList.get(0).equals(book.bookList.get(3))); // true

        for (Book temp : book.bookList) {
            System.out.println("Tytuł to: " + temp.getTitle() + ", " + " Autor to: " + temp.getAuthor() + " hashCode to: " + temp.hashCode()
                    + "\n---------------------------------------------------------------------");
        }


    }
}
