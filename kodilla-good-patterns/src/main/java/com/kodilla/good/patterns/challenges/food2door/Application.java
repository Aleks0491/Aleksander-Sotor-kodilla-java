package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();

        OrderService orderService = new OrderService();
        orderService.processOrder(orderRetriever.orders());

    }
}
