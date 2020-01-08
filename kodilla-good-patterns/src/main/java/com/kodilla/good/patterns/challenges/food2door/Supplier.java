package com.kodilla.good.patterns.challenges.food2door;

public abstract class Supplier {

     private String supplier;

     public Supplier() {
     }

     abstract boolean process(OrderToSupplier orderToSupplier);
}

