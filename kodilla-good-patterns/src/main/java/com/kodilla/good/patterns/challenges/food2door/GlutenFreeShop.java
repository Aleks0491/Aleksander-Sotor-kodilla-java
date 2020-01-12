package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Supplier{


    public GlutenFreeShop(String supplierName) {
        super(supplierName);
    }

    @Override
    boolean process(String productName, Integer count) {

        System.out.println("My order is " + count + " pieces of " + productName );
        return false;
    }
}
