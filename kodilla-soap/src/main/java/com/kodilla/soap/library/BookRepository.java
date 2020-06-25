package com.kodilla.soap.library;

import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class BookRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book javaFirst = new Book();
        javaFirst.setId("1/3");
        javaFirst.setGenre(Genre.TECH);
        javaFirst.setTitle("Pierwsza ksiązka");
        javaFirst.setAuthor("Pierwszy autor");


        books.put(javaFirst.getId(), javaFirst);

        Book javaSecond = new Book();
        javaSecond.setId("2/3");
        javaSecond.setGenre(Genre.CRIME);
        javaSecond.setTitle("Druga ksiązka");
        javaSecond.setAuthor("Drugi autor");


        books.put(javaSecond.getId(), javaSecond);

        Book javaThird = new Book();
        javaThird.setId("3/3");
        javaThird.setGenre(Genre.FANTASY);
        javaThird.setTitle("Trzecia ksiązka");
        javaThird.setAuthor("Trzeci autor");


        books.put(javaThird.getId(), javaThird);
    }

    public Book findBook(String name) {
        Assert.notNull(name, "You have to specify the books's id");
        return books.get(name);
    }
}
