package com.kodilla.testing.statistics;

import java.util.List;

public class StatisticsCalculate {

    private double numbersOfUsers = 0.0;
    private double numbersOfPosts = 0.0;
    private double numbersOfComments = 0.0;
    private double averPostsPerUser = 0.0;
    private double averCommentsPerUser = 0.0;
    private double averCommentsPerPost = 0.0;

    public void calculateAdvStatistics(Statistics statistics) {
        numbersOfUsers = statistics.usersNames().size();

        numbersOfPosts = statistics.postsCount();

        numbersOfComments = statistics.commentsCount();

        if(numbersOfUsers > 0) {
            averPostsPerUser = numbersOfPosts / numbersOfUsers;
        }
        if(numbersOfPosts > 0) {
            averCommentsPerPost = numbersOfComments / numbersOfPosts;
        }
        if(numbersOfUsers > 0) {
            averCommentsPerUser = numbersOfComments / numbersOfUsers;
        }
    }

    public void showStatistics() {
        System.out.println("Numbers of users: " + numbersOfUsers + ";");
        System.out.println("Number of posts: " + numbersOfPosts + ";");
        System.out.println("Number of comments: " + numbersOfComments + ";");
        System.out.println("Average posts per user: " + averPostsPerUser + ";");
        System.out.println("Average comments per post: " + averCommentsPerPost + ";");
        System.out.println("Average comments per user: " + averCommentsPerUser + ".");
    }

    public double getAverPostsPerUser() {
        return averPostsPerUser;
    }

    public double getAverCommentsPerUser() {
        return averCommentsPerUser;
    }

    public double getAverCommentsPerPost() {
        return averCommentsPerPost;
    }
}
