package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Master implements Observer {
    private String name;
    private List<Student> studentsList = new ArrayList<>();
    private List<TaskQueue> taskQueueList;
    private int updateCount;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New task in " + taskQueue.getTaskQueueName() + "\n" +
                " (total: " + taskQueue.getTaskQueues().size() + " tasks)");
        updateCount++;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public String getName() {
        return name;
    }

    public List<TaskQueue> getTaskQueueList() {
        return taskQueueList;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
