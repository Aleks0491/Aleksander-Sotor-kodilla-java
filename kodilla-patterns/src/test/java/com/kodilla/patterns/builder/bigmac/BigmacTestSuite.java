package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .buns(Buns.NOSESAM)
                .burgers(3)
                .sauce(Sauce.STANDARD)
                .ingredients(new Ingredients(Ingredients.BACON))
                .ingredients(new Ingredients(Ingredients.CHEESE))
                .ingredients(new Ingredients(Ingredients.ONION))
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String bunType = bigmac.getBuns().getName();
        Buns buns = bigmac.getBuns();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals(Buns.NOSESAM.getName(), bunType);
        Assert.assertEquals(Buns.NOSESAM, buns);
    }

   @Test
    public void testBigmacBuilderWithoutIngrdeients() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .buns(Buns.NOSESAM)
                .sauce(Sauce.STANDARD)
                .burgers(3)
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String bunType = bigmac.getBuns().toString();
        String sauceType = bigmac.getSauce().toString();

        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("Without sesame", bunType);
        Assert.assertEquals(Sauce.getSTANDARD(), sauceType);
    }
}
