package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceRepositorySave(){

        //Given

        Item item = new Item(new BigDecimal(100),1,new BigDecimal(200));
        Invoice invoice = new Invoice("1");
        Product product = new Product("Testowy produkt");




    }

}