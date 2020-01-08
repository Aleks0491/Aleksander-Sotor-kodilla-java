package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderService {

    public boolean processOrder(List<OrderFromCustomer> orderFromCustomerList) {
        boolean overallResult = true;
        for(int i=0; i < orderFromCustomerList.size(); i++) {
            OrderFromCustomer orderFromCustomer = orderFromCustomerList.get(i);
            boolean result = orderFromCustomer.getSupplier().process(new OrderToSupplier(orderFromCustomer));
            overallResult = overallResult && result;
            orderFromCustomer.setResult(result);
        }
        return  overallResult;
    }
}
