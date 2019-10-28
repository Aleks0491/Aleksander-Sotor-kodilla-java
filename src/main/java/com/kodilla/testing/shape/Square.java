package com.kodilla.testing.shape;

public class Square implements Shape {
    double a = 0;

    public Square(double a) {
        this.a = a;
    }

    public void getShapeName() {
        String name = "Square";
    }

    public void getField() {
        double squareField = a * a;
    }
}
