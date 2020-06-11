package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class PizzaOrderTestSuite {
    @Test
    public void testPizzaCostWithExtraCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(13.50), cost);
    }

    @Test
    public void testPizzaDescriptionWithExtraCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with tomato sauce and cheese + extra cheese", description);
    }

    @Test
    public void testPizzaCostWithManyAdditions() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        BigDecimal totalCost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal("21.30"), totalCost);
    }
    @Test
    public void testPizzaDescriptionWithManyAdditions() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Pizza with tomato sauce and cheese " +
                "+ extra cheese + mushrooms + paprika + bacon", description);
    }
}
