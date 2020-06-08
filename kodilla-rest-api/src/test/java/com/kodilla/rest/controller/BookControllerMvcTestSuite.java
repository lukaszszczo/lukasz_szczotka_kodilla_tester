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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

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
        booksList.add(new BookDto("title 1","author 1"));
        booksList.add(new BookDto("title 2","author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        Gson gson = new Gson();
        String json = gson.toJson(new BookDto("title 2","author 2"));
        System.out.println(json);
        //when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books").content(json)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(200));
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }
   /* @Test
    public void shouldAddBooks() throws Exception {
        //given
        Gson gson = new Gson();
        String json = gson.toJson(books);

    }*/


}
