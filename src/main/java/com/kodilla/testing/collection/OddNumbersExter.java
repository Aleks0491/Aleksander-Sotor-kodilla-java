package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExter {
    private List<Integer> oddNumbers = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers) {

        for (int num : numbers) {
            if (num % 2 == 0) {
                oddNumbers.add(num);
            }
        }

        System.out.println("OddNumbers list size: " + oddNumbers.size());
        return oddNumbers;
    }
}
