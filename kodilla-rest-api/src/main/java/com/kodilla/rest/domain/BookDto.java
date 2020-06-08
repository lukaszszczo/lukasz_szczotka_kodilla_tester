package com.kodilla.rest.domain;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class BookDto {

    private  String title;

    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title) &&
                Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public BookDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
