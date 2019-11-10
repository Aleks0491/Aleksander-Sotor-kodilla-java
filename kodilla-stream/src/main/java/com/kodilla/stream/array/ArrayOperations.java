package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverageIntNumbers(int[] numbers) {

        Arrays.stream(numbers).forEach(System.out::println);

        double average = Arrays.stream(numbers)
                .average()
                .getAsDouble();

        return average;
    }
}
