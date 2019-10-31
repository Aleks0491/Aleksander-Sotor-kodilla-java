package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
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
        List<Integer> oddNumbers = new ArrayList<>();
        //When
        int size = oddNumbers.size();
        System.out.println("Size of the oddNumber list is: " + size);
        //Then
        Assert.assertEquals(0, size);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        //When

        //Then
        Assert.assertEquals(2, oddNumbers.size())
    }
}
