package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;
        TaskList list = (TaskList) o;
        return Objects.equals(getTasks(), list.getTasks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTasks());
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
