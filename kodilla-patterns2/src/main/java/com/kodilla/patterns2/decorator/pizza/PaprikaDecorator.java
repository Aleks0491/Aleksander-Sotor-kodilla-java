package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PaprikaDecorator extends AbstractBasicPizzaDecorator {
    protected PaprikaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("2.30"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + paprika";
    }
}
