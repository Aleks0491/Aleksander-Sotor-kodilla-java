package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddValue() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(3.0, 5.0);

        //Then
        Assert.assertEquals(8.0, result, 0.0);
    }

    @Test
    public void testSubtractValue() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.sub(3.0, 5.0);

        //Then
        Assert.assertEquals(-2.0, result, 0.0);
    }

    @Test
    public void testMultipleValue() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.mul(3.0, 5.0);

        //Then
        Assert.assertEquals(15.0, result, 0.0);
    }

    @Test
    public void testDivideValue() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.div(3.0, 5.0);

        //Then
        Assert.assertEquals(0.6, result, 0.0);
    }
}
