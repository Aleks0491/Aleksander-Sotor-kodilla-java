package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public OrderDTO orders() {

        Map<Product, Integer> orderDTOmap = new HashMap<>();
        OrderDTO orderDTO = new OrderDTO();

        Product product = new Product("Flour", new BigDecimal("3.25" ), new ExtraFoodShop("ExtraFoodShop"));
        Product product2 = new Product("Flour", new BigDecimal("3.85" ), new ExtraFoodShop("GlutenFreeShop"));
        Product product1 = new Product("Bread", new BigDecimal("5.50"), new GlutenFreeShop("GlutenFreeShop"));
        orderDTO.addProduct(product, 5);
        orderDTO.addProduct(product1, 2);
        orderDTO.addProduct(product2, 3);

        return orderDTO;

    }
}
