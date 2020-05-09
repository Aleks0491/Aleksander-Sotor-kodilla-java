package com.kodilla.hibernate.invoice.dao;

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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    private List<Product> productList = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product ");
        Product product2 = new Product("Product 2");
        Product product3 = new Product("Product 3");

        items.add(new Item(product, new BigDecimal("25"), 2, new BigDecimal("50")));
        items.add(new Item(product2, new BigDecimal("10"), 1, new BigDecimal("10")));
        items.add(new Item(product3, new BigDecimal("1"), 20, new BigDecimal("20")));

        Invoice invoice = new Invoice("1", items);

        //When
        invoiceDao.save(invoice);
        BigDecimal value = items.get(0).getValue();
        int id = invoice.getId();

        //Then
        Assert.assertEquals(new BigDecimal("50"), value);
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
