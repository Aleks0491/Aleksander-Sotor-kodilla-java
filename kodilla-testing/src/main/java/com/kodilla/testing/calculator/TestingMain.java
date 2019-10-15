package com.kodilla.testing.calculator;

import java.util.concurrent.Callable;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();
        int addValue = calculator.addAToB(50, 35);
        int subtrValue = calculator.subtractBfromA(60, 70);
        if((addValue == 85) && (subtrValue == 10)) {
            System.out.println("Calculator is ok");
        } else {
            System.out.println("There is something wrong!");
        }
    }
}


