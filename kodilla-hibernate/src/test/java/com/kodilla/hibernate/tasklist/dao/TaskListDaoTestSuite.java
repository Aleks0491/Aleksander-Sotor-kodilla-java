package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String listName = "Task list no 1";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, "To do list");
        taskListDao.save(taskList);
        //When
        List<TaskList> result = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, result.size());

        //CleanUp
        int id = result.get(0).getId();
        taskListDao.deleteById(id);
    }
}
