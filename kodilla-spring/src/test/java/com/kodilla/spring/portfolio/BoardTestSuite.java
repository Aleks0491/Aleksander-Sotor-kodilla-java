package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
    @Test
    public  void testGetBoardBean() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When
        Board board = context.getBean(Board.class);
        //Then
       Assert.assertEquals(new ArrayList<>(), board.getDoneList().getTasks());
       Assert.assertEquals(new ArrayList<>(), board.getInProgressList().getTasks());
       Assert.assertEquals(new ArrayList<>(), board.getToDoList().getTasks());
    }


    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Clean laptop");
        board.getInProgressList().addTask("Learn programming");
        board.getDoneList().addTask("Eat breakfast");
        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();
        //Then
        Assert.assertEquals(Arrays.asList("Clean laptop"), toDoList.getTasks());
        Assert.assertEquals(Arrays.asList("Learn programming"), inProgressList.getTasks());
        Assert.assertEquals(Arrays.asList("Eat breakfast"), doneList.getTasks());

    }


}
