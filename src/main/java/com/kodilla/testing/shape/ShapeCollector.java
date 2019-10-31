package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);

        System.out.println("Size of the listShape is: " + shapeList.size());
    }
    public void removeFigure (Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure (int n) {
        Shape gettingFigure = shapeList.get(n);
        return gettingFigure;
    }

    public void showFigures() {
        System.out.println(shapeList);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}
