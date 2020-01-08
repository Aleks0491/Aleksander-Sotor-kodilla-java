package com.kodilla.good.patterns.challenges.food2door;

public class OrderFromCustomer {

    private Supplier supplier;
    private String product;
    private int quantity;
    private boolean result;

    public OrderFromCustomer(Supplier supplier, String product, int quantity) {
        this.supplier = supplier;
        this.quantity = quantity;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
