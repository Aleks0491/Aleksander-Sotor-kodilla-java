package com.kodilla.good.patterns.challenges.orderService;

public class InformationService {

    private OrderProcessor orderProcessor;

    public void inform(User user, boolean b) {

        if(b) {
         System.out.println("Order " + user.getLastName() + " can be realised");
        } else {
            System.out.println("Order " + user.getLastName() + " can't be realised");
        }
    }
}

