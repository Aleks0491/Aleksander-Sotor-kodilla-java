package com.kodilla.good.patterns.challenges.orderService;

public class OrderDto {

    private final User user;
    private final boolean isOrdered;

    OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
