package com.kodilla.patterns.factory.task;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTaskGetTaskName() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        boolean isDone = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Drive to: ", drivingTask.getTaskName());
        Assert.assertEquals(false, isDone);
    }

    @Test
    public void testFactoryDrivingTaskWhenTaskIsNotExecuted() throws InterruptedException {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        boolean isDone = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Drive to: ", drivingTask.getTaskName());
        Assert.assertEquals(false, isDone);
    }

    @Test
    public void testFactoryDrivingTaskWhenTaskIsDone() throws InterruptedException {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        boolean isDone = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Drive to: ", drivingTask.getTaskName());
        Assert.assertFalse(isDone);
        Thread.sleep(2000);
        isDone = drivingTask.isTaskExecuted();
        Assert.assertTrue(isDone);
    }



    @Test
    public void testFactoryPaintingTaskWhenTaskIsNotExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);;
        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
    }


    @Test
    public void testFactoryPaintingTaskWhenTaskIsDone() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryShoppingTaskWhenTaskIsNotExecuted() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("First shopping", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTaskWhenTaskIsDone() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("First shopping", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
