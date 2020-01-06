package com.kodilla.good.patterns.challenges.orderService;

public class Something {


    private String name;
    private String mark;
    private String model;
    private int quantity;

    public Something(String name, String mark, String model, int quantity) {
        this.name = name;
        this.mark = mark;
        this.model = model;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

}
