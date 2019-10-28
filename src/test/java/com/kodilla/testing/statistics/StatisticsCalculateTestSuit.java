package com.kodilla.testing.statistics;

import org.junit.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuit {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int quantityOfPosts = statisticsCalculate.usersNames().size();
        //Then
        Assert.assertEquals(0, quantityOfPosts);

    }

    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesMock = new ArrayList<>();
            for(int i = 0; i < 1000; i++) {
                usersNamesMock.add("user" + i);
            }
        when(statisticsMock.usersNames()).thenReturn(usersNamesMock);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int quantityOfUsers = statisticsCalculate.usersNames().size();
        //Then
        Assert.assertEquals(1000, quantityOfUsers);

    }
    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int quantityCommentsMock = 0;
        when(statisticsMock.commentsCount()).thenReturn(quantityCommentsMock);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate(statisticsMock);
        //When
        int quantityOfComments = statisticsCalculate.commentsCount();
        //Then
        Assert.assertEquals(0, quantityOfComments);

    }

   /* @Test
    public void testCalculateAdvStatistic4(Statistics statistics) {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
    }*/

}
