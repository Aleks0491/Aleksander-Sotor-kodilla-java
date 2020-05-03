package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public final static String DRIVING = "Driving task";
    public final static String PAINTING = "Painting task";
    public final static String SHOPPING = "Shopping task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Drive to: ", "Krakow ", "with car");
            case PAINTING:
                return new PaintingTask("Paint", "blue", "wall");
            case SHOPPING:
                return new ShoppingTask("First shopping", "Bread", 5.50);
            default:
                return null;
        }
    }
}
