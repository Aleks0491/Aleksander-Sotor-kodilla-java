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
        numbers.removeAll(numbers);
        OddNumbersExter oddNumbersExterminator = new OddNumbersExter();
        //When
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(null, oddNumbersExterminator.oddNumbers.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExter oddNumbersExterminator = new OddNumbersExter();
        //When
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(2, oddNumbersExterminator.oddNumbers.size());
    }
}
