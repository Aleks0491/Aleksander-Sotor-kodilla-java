package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Supplier {


    public ExtraFoodShop(String supplierName) {
        super(supplierName);
    }



    @Override
    boolean process(String productName, Integer count) {

        System.out.println("I order " + count + " pieces of "  + productName);
        return true;
    }
}
