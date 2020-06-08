package com.kodilla.rest.controller;


import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTestSuite {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;


    @Test
    public void shouldFetchBooks() throws Exception {

        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBooks() throws Exception {

        //given

        Gson gson = new Gson();
        String json = gson.toJson(new BookDto("title 2", "author 2"));



        //when & then
        this.mockMvc.perform(MockMvcRequestBuilders.post("/books").content(json)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200)).andExpect(content()// do tego miejsca pokazuje że jest ok, skoro jest ok to dlaczego nie widzi tego ponizej tylko twierdzi ze No value at JSON path "$.title" :/
                .contentTypeCompatibleWith("/books/json")) // org.springframework.http.InvalidMediaTypeException: Invalid mime type "/books/UTF-8": 'type' must not be empty , w tym miejscu hmmmm
                .andExpect(jsonPath("$.title").value("title 2"))
                .andExpect(jsonPath("$.author").value("author 2")) ;



    }
}
