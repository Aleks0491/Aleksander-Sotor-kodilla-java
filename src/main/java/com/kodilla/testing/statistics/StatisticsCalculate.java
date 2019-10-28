package com.kodilla.testing.statistics;

import java.util.List;

public class StatisticsCalculate implements Statistics{

    Statistics statistics;

    private double numbersOfUsers = 0;
    private double numbersOfPosts = 0;
    private double numbersOfComments = 0;
    private double averPostsPerUser = 0;
    private double averCommentsPerUser = 0;
    private double averCommentsPerPost = 0;

    public StatisticsCalculate(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        //numbersOfUsers = usersNames().size();

        //numbersOfPosts = ;

        //numbersOfComments = ;

        averPostsPerUser = numbersOfPosts / numbersOfUsers;

        averCommentsPerPost = numbersOfComments / numbersOfPosts;

        averCommentsPerUser = numbersOfComments / numbersOfUsers;

    }

    public void showStatistics() {
        System.out.println("Numbers of users: " + numbersOfUsers + ";");
        System.out.println("Number of posts: " + numbersOfPosts + ";");
        System.out.println("Number of comments: " + numbersOfComments + ";");
        System.out.println("Average posts per user: " + averPostsPerUser + ";");
        System.out.println("Average comments per post: " + averCommentsPerPost + ";");
        System.out.println("Average comments per user: " + averCommentsPerUser + ".");
    }

    public List<String> usersNames() {
        return null;
    }

    public int postsCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }
}
