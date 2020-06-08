package com.kodilla.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
@ResponseBody
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@Valid @RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



