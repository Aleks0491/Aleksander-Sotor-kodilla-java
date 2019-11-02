package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExter {
    List<Integer> oddNumbers;
    List<Integer> numbers = new ArrayList<>();

    /*for(int n = 0; n < 10; n++) {
        Random generator = new Random();
        Integer value = generator.nextInt(20);
        numbers.add(value);
    }*/

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> oddNumbers = new ArrayList<>();
        for(int j = 0; j < numbers.size(); j++) {
            int num = numbers.get(j);
            if(num % 2 == 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println("OddNumbers list size: " + oddNumbers.size());
        return oddNumbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }
}
