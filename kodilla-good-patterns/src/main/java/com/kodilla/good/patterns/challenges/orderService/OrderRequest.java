package com.kodilla.good.patterns.challenges.orderService;

public class OrderRequest {

    private User user;
    private Something something;

    public OrderRequest(User user, Something something) {
        this.user = user;
        this.something = something;
    }

    public User getUser() {
        return user;
    }

    public Something getSomething() {
        return something;
    }
}
