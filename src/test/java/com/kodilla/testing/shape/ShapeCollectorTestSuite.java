package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test " + testCounter + "...");
    }

    @Test
    public void testAddFigure() {
        //Given
        Triangle triangle = new Triangle(2.5, 5.0);
        Square square1 = new Square(4.0);
        Square square2 = new Square(2.0);
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(8.1);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(circle2);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square2);
        //Then
        Assert.assertEquals(5, shapeCollector.getShapeList().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Triangle triangle = new Triangle(2.5, 5.0);
        Square square1 = new Square(4.0);
        Square square2 = new Square(2.0);
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(8.1);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(square2);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(circle2);
        //When
        shapeCollector.removeFigure(circle1);
        //Then
        Assert.assertEquals(4, shapeCollector.getShapeList().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle = new Triangle(2.5, 5.0);
        Square square1 = new Square(4.0);
        Square square2 = new Square(2.0);
        Circle circle = new Circle(4.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(square2);
        shapeCollector.addFigure(circle);
        //When
        Shape testShape = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(square2, testShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        Triangle triangle = new Triangle(2.5, 5.0);
        Square square1 = new Square(4.0);
        Square square2 = new Square(2.0);
        Circle circle = new Circle(4.0);

        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square1);
        shapeCollector.addFigure(square2);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.getShapeList();
        //Then

    }
}
