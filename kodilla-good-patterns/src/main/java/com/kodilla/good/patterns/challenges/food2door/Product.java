package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;

public class Product {

    private  String name;
    private BigDecimal price;
    private Supplier supplier;

    public Product(String name, BigDecimal price, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        String product ="Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", supplier=" + supplier.getSupplierName() +
                '}';
        return  product;
    }
}
