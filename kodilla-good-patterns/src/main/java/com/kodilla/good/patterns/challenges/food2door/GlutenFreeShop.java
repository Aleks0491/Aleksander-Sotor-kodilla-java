package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Supplier{

    private String product1;
    private int timeToRealised;

    public GlutenFreeShop(String product1, int timeToRealised) {
        this.product1 = product1;
        this.timeToRealised = timeToRealised;
    }

    public String getProduct1() {
        return product1;
    }

    public int getDaysToRealised() {
        return timeToRealised;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public void setDaysToRealised(int daysToRealised) {
        this.timeToRealised = daysToRealised;
    }

    @Override
    boolean process(OrderToSupplier orderToSupplier) {

        if(!orderToSupplier.getProduct().equals(getProduct1())) {
            return false;
        }
        return true;
    }
}
