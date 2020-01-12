package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderDTO {

    private  Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer count) {

        products.put(product, count);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
