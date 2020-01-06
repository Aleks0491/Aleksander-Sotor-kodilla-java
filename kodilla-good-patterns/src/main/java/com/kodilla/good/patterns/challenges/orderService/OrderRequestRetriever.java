package com.kodilla.good.patterns.challenges.orderService;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan", "Kowalski", "JKID", "jk@j.ll");

       // Something something = new Something("car", "vovlo", "", 1);
        Something something1 = new Something("Book", "", "", 5 );

        return new OrderRequest(user, something1);
    }
}
