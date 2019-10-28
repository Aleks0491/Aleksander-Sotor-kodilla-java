package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double basisLength = 0;
    double height = 0;

    public Triangle(double basisLength, double height) {
        this.basisLength = basisLength;
        this.height = height;
    }

    public double getBasisLength() {
        return basisLength;
    }

    public double getHeight() {
        return height;
    }

    public void getShapeName() {
        String name = "Triangle";
    }

    public void getField() {
        
        double triangleField = 0.5 * basisLength * height;
    }
}
