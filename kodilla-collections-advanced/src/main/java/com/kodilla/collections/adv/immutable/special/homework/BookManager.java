package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Book> bookList = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        // wiem ze to nie działa, zostawie to sobie na pozniej
        if (bookList.contains(book) == false) {
            bookList.add(book);
            return book;
        } else {
            return bookList.get(bookList.indexOf(book));
        }
    }


}
