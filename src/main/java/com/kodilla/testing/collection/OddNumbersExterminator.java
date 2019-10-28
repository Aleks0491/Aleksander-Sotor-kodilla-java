package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {

    public List<Integer>
    List<Integer> numbers = new ArrayList<>();
        for ( int i = 0; i < 10; i++) {
            Random generator = new Random();
            Integer value = generator.nextInt(20);
        numbers.add(value);
    }

    public List<Integer> exterminate(ArrayList<Integer> numbers){
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
}
