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
        List<Integer> resultList = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, resultList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(6);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(8);
        expectedResult.add(6);
        OddNumbersExter oddNumbersExterminator = new OddNumbersExter();
        //When
        List<Integer> resultList =  oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(expectedResult, resultList);
    }
}
