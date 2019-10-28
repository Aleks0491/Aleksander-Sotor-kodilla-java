package com.kodilla.testing.shape;

public class Circle implements Shape {
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void getShapeName() {
        String name = "Circle";
    }

    public void getField() {

        double circleField = 3.14 * radius * 2;
    }
}
