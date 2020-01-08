package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Supplier {

    private String product;
    private int daysToRealised;

    public ExtraFoodShop(String product, int daysToRealised) {
        this.product = product;
        this.daysToRealised = daysToRealised;
    }

    public String getProduct() {
        return product;
    }

    public int getDaysToRealised() {
        return daysToRealised;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setDaysToRealised(int daysToRealised) {
        this.daysToRealised = daysToRealised;
    }

    @Override
    boolean process(OrderToSupplier orderToSupplier) {

        if(!orderToSupplier.getProduct().equals(getProduct())) {
            return false;
        }

        if(orderToSupplier.getQuantity() < 2) {
            return false;
        }
        return true;
    }
}
