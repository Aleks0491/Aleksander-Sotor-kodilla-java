package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }
}
