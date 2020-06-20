package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private List<Observer> observers;
    private String taskQueueName;
    private String author;
    private ArrayDeque<Task> taskQueues;


    public TaskQueue(String taskQueueName, String author) {
        observers = new ArrayList<>();
        taskQueues = new ArrayDeque<>();
        this.taskQueueName = taskQueueName;
        this.author = author;
    }

    public void addTask(Task task) {
        taskQueues.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getTaskQueueName() {
        return taskQueueName;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayDeque<Task> getTaskQueues() {
        return taskQueues;
    }
}
