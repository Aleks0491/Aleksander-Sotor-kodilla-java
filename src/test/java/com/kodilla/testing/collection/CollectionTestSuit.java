package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuit {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExter oddNumbersExterminator = new OddNumbersExter();
        //When
        oddNumbersExterminator.getNumbers();
        //Then
        Assert.assertEquals(0, oddNumbersExterminator.getOddNumbers().size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        OddNumbersExter oddNumbersExterminator = new OddNumbersExter();
        //When
        oddNumbersExterminator.getNumbers();
        //Then
        Assert.assertEquals(2, oddNumbersExterminator.getOddNumbers().size());
    }
}
