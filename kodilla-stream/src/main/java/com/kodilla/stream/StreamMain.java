package com.kodilla.stream;

import java.lang.String;
import java.util.Arrays;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Hey:)", string -> "AAA " + string + " AAA");
        poemBeautifier.beautify("lower letters?", s -> s.toUpperCase());
        poemBeautifier.beautify("Text to beautifier", string -> "**<>** " + string + " **<>**");
        poemBeautifier.beautify("Next text", string -> string.replace('e', 'E'));
        poemBeautifier.beautify("New next text", string -> string.replace("ext", "igh"));
        poemBeautifier.beautify("New next text again", string -> {
            return Arrays.toString(string.split("e"));
        });
    }
}
