package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student johnSmith = new Student("John Smith");
        Student joeDoe = new Student("Joe Doe");
        Student janeWillis = new Student("Jane Willis");
        Master chrisRamm = new Master("Chris Ramm");
        Master kimEvans = new Master("Kim Evans");
        TaskQueue johnTaskQueue = new TaskQueue("John's queue", johnSmith.getName());
        TaskQueue joeTaskQueue = new TaskQueue("Joe's queue", joeDoe.getName());
        TaskQueue janeTaskQueue = new TaskQueue("Jane's queue", janeWillis.getName());
        janeTaskQueue.registerObserver(chrisRamm);
        janeTaskQueue.registerObserver(kimEvans);
        joeTaskQueue.registerObserver(kimEvans);
        johnTaskQueue.registerObserver(chrisRamm);

        //When
        johnTaskQueue.addTask(new Task("Task 1", "Something"));
        joeTaskQueue.addTask(new Task("Joe Task", "kkk"));
        joeTaskQueue.addTask(new Task("Joe Task 2", "kkkk"));
        janeTaskQueue.addTask(new Task("Jane Task","mmm"));
        janeTaskQueue.addTask(new Task("Jane Task 2", "vvv"));

        //Then
        assertEquals(2, janeTaskQueue.getObservers().size());
        assertEquals(4, kimEvans.getUpdateCount());
        assertEquals("Jane Task", janeTaskQueue.getTaskQueues().getFirst().getTaskName());
        assertEquals("Jane Task 2", janeTaskQueue.getTaskQueues().getLast().getTaskName());
        assertEquals(3, chrisRamm.getUpdateCount());
        assertEquals("Something", johnTaskQueue.getTaskQueues().getFirst().getDescription());

    }

    @Test
    public void testAddStudents() {
        //Given
        Master chrisRamm = new Master("Chris Ramm");
        Master kimEvans = new Master("Kim Evans");
        Student johnSmith = new Student("John Smith");
        Student joeDoe = new Student("Joe Doe");
        Student janeWillis = new Student("Jane Willis");

        //When
        kimEvans.addStudent(joeDoe);
        chrisRamm.addStudent(janeWillis);
        chrisRamm.addStudent(johnSmith);

        //Then
        assertEquals(1, kimEvans.getStudentsList().size());
        assertEquals(2, chrisRamm.getStudentsList().size());
        assertEquals("Joe Doe", kimEvans.getStudentsList().get(0).getName());

    }

    @Test
    public void testAddMaster() {
        //Given
        Master chrisRamm = new Master("Chris Ramm");
        Master kimEvans = new Master("Kim Evans");
        Student johnSmith = new Student("John Smith");
        Student joeDoe = new Student("Joe Doe");
        Student janeWillis = new Student("Jane Willis");

        //When
        janeWillis.addMaster(chrisRamm);
        joeDoe.addMaster(kimEvans);
        johnSmith.addMaster(kimEvans);
        johnSmith.addMaster(chrisRamm);

        //Then
        assertEquals(1, janeWillis.getMasters().size());
        assertEquals("Kim Evans", joeDoe.getMasters().get(0).getName());
        assertEquals(2, johnSmith.getMasters().size());

    }
}
