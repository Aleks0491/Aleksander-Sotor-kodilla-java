package com.kodilla.exception.test;

public class ExceptionHandling  {

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(11.0, 25.0);
        } catch(Exception e) {
            System.out.println("Some error");
        } finally {
            System.out.println("After catch");
        }
    }

}
