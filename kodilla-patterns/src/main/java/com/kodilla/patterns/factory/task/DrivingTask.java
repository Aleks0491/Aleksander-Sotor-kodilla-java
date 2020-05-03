package com.kodilla.patterns.factory.task;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private LocalDateTime endTime;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        endTime = LocalDateTime.now().plusSeconds(2);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return endTime != null && LocalDateTime.now().compareTo(endTime) >= 0;
    }
}
