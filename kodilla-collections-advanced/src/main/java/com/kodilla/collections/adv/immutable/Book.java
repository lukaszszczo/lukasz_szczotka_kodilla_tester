package com.kodilla.collections.adv.immutable;

public class Book {

    protected String author;
    protected String title;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
