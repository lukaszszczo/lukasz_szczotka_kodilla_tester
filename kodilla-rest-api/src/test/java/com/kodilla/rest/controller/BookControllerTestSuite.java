package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestSuite {


   @Test
   public  void shouldFetchBooks(){

       //Given
       BookService bookServiceMock = Mockito.mock(BookService.class);
       BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("test1","test1"));
        bookList.add(new BookDto("test2","test2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
       //When


       List<BookDto> result = bookController.getBooks();

       //Then
       assertThat(result).hasSize(2);



   }

   @Test
    public void shouldAddBook(){

       //given
       BookService bookServiceMock = Mockito.mock(BookService.class);
       BookController bookController = new BookController(bookServiceMock);

       //when
        bookController.addBook(new BookDto("test1","test1"));

       //then
       Mockito.verify(bookServiceMock).addBook(new BookDto("test1","test1"));
   }

}