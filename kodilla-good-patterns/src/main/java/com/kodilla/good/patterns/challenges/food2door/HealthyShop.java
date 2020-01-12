package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class HealthyShop extends Supplier {


    public HealthyShop(String supplierName) {
        super(supplierName);
    }


    @Override
    boolean process(String productName, Integer count) {

        System.out.println("Please deliver to me " + count + " of " + productName);
        return false;
    }
}
