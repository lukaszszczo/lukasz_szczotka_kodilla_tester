package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
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
    public void testInvoiceRepositorySave() {

        //Given

        Product testowy1 = new Product("Testowy1");
        Product testowy2 = new Product("Testowy2");
        Product testowy3 = new Product("Testowy3");

        Item item = new Item(new BigDecimal(111), 1, new BigDecimal(222), testowy1);
        Item item1 = new Item(new BigDecimal(333), 1, new BigDecimal(444), testowy2);
        Item item2 = new Item(new BigDecimal(555), 1, new BigDecimal(666), testowy3);

        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When

        invoiceRepository.save(invoice);
        int result = invoice.getId();

        //Then
        Assert.assertNotEquals(0, result);

        // Cleanup

        invoiceRepository.deleteById(result);

        }


    }

