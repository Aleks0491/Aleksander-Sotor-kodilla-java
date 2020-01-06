package com.kodilla.good.patterns.challenges.orderService;

public class OrderService {

    private WarehouseService warehouseService;

    public OrderService() {
        this.warehouseService = new WarehouseService();
    }

    public boolean order(User user, Something something) {

        if(warehouseService.check(something)) {
            warehouseService.decreaseStorage(something);
            return true;
        } else {
            return false;
        }
    }
}
