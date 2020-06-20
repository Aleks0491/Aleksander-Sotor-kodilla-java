package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private TaskQueue taskQueue;
    private List<Master> masters = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addMaster(Master master) {
        if(null != master) {
            masters.add(master);
        }
    }

    public String getName() {
        return name;
    }

    public TaskQueue getTaskQueue() {
        return taskQueue;
    }

    public List<Master> getMasters() {
        return masters;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
