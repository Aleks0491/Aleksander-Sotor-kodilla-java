package com.kodilla.testing.statistics;

import org.junit.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

import static javax.print.attribute.standard.MediaSizeName.A;
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
    public void testCalculateAdvStatisticsWhenPostCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerPost(),0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);

    }

    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1.0, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);

    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersName = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
       statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);

    }

    @Test
    public void testCalculateAdvStatisticWhenCommentsCountIsSmallerThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersName = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
        Assert.assertEquals(0.5, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticWhenCommentsCountIsBiggerThanPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersName = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);
        Assert.assertEquals(5.0, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticWhenUsersCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersName = new ArrayList<>();
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        when(statisticsMock.usersNames()).thenReturn(usersName);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(500);
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(0.0, statisticsCalculate.getAverPostsPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticWhenUsersNameIsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersName = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            usersName.add("user" + i);
        }
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersName);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2.0, statisticsCalculate.getAverCommentsPerPost(), 0.1);
        Assert.assertEquals(1.0, statisticsCalculate.getAverCommentsPerUser(), 0.1);
        Assert.assertEquals(0.5, statisticsCalculate.getAverPostsPerUser(), 0.1);
    }
}
