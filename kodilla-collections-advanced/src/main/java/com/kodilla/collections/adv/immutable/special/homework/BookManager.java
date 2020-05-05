package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManager {

    int id = 1; // jako key do Mapy

    Map<Integer, Book> bookList = new HashMap<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        if (bookList.containsValue(book) == false) {
            bookList.put(id, book);
            id++;
            return book;
        } else {
            return bookList.get(bookList.hashCode());
        }
    }

}
