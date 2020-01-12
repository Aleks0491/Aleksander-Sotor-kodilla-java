package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OrderService {

    public void processOrder(OrderDTO order) {

        Map<Product, Integer> orderMap = order.getProducts();
        List<Product> ordered = new LinkedList<>();
        List<Product> notOrdered = new LinkedList<>();

        for(Map.Entry<Product, Integer> product: orderMap.entrySet()) {
            boolean isOrdered = product.getKey().getSupplier().process(product.getKey().getName(), product.getValue());
            if(isOrdered) {
                ordered.add(product.getKey());
            } else {
                notOrdered.add(product.getKey());
            }
        }

        System.out.println(ordered);
        System.out.println(notOrdered);
    }
}
