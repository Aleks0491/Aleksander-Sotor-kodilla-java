package com.kodilla.good.patterns.challenges.food2door;

public class OrderToSupplier {

    private String product;
    private int quantity;

    public OrderToSupplier(OrderFromCustomer orderFromCustomer) {
        this.product = orderFromCustomer.getProduct();
        this.quantity = orderFromCustomer.getQuantity();
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

