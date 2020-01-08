package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class HealthyShop extends Supplier {

    private String product;
    private int timeToRealised;

    public HealthyShop(String product, int timeToRealised) {
        this.product = product;
        this.timeToRealised = timeToRealised;
    }

    public String getProduct() {
        return product;
    }

    public int getTimeToRealised() {
        return timeToRealised;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setTimeToRealised(int timeToRealised) {
        this.timeToRealised = timeToRealised;
    }

    public void createStandingOrders(String product) {
        List<String> standingOrder = new LinkedList<>();
        standingOrder.add(getProduct());
    }

    boolean process(OrderToSupplier orderToSupplier) {

        if(!orderToSupplier.getProduct().equals(getProduct())) {
            return false;
        }

        if(getTimeToRealised() > 1) {
            return false;
        }
        return true;
    }
}
