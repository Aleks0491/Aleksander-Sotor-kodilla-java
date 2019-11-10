package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 5, 5, 4, 3, 2,
                1, 1, 1, 2, 3, 4, 5, 5, 5, 4};
        //When
        double expectedValue  =  ArrayOperations.getAverageIntNumbers(numbers);

        //Then
        Assert.assertEquals(3.25, expectedValue, 0.0 );
    }
}
