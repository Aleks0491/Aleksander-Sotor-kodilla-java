package com.kodilla.good.patterns.challenges.orderService;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getSomething());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), true);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getSomething());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            informationService.inform(orderRequest.getUser(), false);
            return new OrderDto(orderRequest.getUser(), false);

        }
    }
}
