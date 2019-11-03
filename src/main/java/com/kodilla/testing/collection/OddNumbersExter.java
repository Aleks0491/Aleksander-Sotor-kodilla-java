package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExter {
    List<Integer> oddNumbers;


    public List<Integer> exterminate(List<Integer> numbers){
        numbers.add(1);
        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);
        //numbers.add(11);
        List<Integer> oddNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if(num % 2 == 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println("OddNumbers list size: " + oddNumbers.size());
        return oddNumbers;
    }
}
