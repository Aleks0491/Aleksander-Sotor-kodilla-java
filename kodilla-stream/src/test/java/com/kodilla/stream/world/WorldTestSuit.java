package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuit {
    @Test
    public void testWorld() {
        //Given
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("78945612")));
        europe.add(new Country("Germany", new BigDecimal("456123789")));
        europe.add(new Country("France", new BigDecimal("123456789")));

        List<Country> asia = new ArrayList<>();
        asia.add(new Country("China", new BigDecimal("7418529630")));
        asia.add(new Country("India", new BigDecimal("9638527410")));
        asia.add(new Country("Pakistan", new BigDecimal("1234567890")));

        List<Country> northAmerica  = new ArrayList<>();
        northAmerica.add(new Country("USA", new BigDecimal("21563254")));
        northAmerica.add(new Country("Canada", new BigDecimal("45678912")));
        northAmerica.add(new Country("Mexico", new BigDecimal("36985214")));

        List<Continent> wholeWorld = new ArrayList<>();
        wholeWorld.add(new Continent("Europe", europe));
        wholeWorld.add(new Continent("Asia", asia));
        wholeWorld.add( new Continent("North America", northAmerica));

        //When
        BigDecimal quantityPeople = wholeWorld.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, curent ) -> sum = sum.add(curent));

        //Then
        BigDecimal expectedValue = new BigDecimal("19054378500");
        Assert.assertEquals(expectedValue, quantityPeople);
    }
}
