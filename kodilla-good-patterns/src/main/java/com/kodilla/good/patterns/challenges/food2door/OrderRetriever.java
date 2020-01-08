package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {

    private Supplier ExtraFoodShop;
    private Supplier GlutenFreeShop;
    private Supplier HealthyShop;

    public List<OrderFromCustomer> retrieve() {

        List<OrderFromCustomer> orderFromCustomersList = new ArrayList<>();
        orderFromCustomersList.add(new OrderFromCustomer(ExtraFoodShop, "Milk", 3));
        orderFromCustomersList.add(new OrderFromCustomer(ExtraFoodShop, "Bread", 2));
        orderFromCustomersList.add(new OrderFromCustomer(GlutenFreeShop, "Pasta", 4));
        orderFromCustomersList.add(new OrderFromCustomer(HealthyShop, "Flour", 4));

        return orderFromCustomersList;
    }
}
