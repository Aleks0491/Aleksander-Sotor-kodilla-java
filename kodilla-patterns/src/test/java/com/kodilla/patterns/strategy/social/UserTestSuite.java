package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new ZGeneration("John Smith");
        User user2 = new YGeneration("Joe Doe");
        User user3 = new Millenials("Kate Millis");

        //When
        String user1Publish = user1.sharePost();
        System.out.println("John Smith publish: " + user1Publish);
        String user2Publish = user2.sharePost();
        System.out.println("Joe Doe publish: " + user2Publish);
        String user3Publish = user3.sharePost();
        System.out.println("Kate Millis: " + user3Publish);

        //Then
        Assert.assertEquals("Most using Facebook", user1Publish);
        Assert.assertEquals("Most using Snapchat", user2Publish);
        Assert.assertEquals("Most using Twitter", user3Publish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("John Smith");

        //When
        String user1Publish = user1.sharePost();
        System.out.println("John Smith: " + user1Publish);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Publish = user1.sharePost();
        System.out.println("John Smith now publish: " + user1Publish );

        //Then
        Assert.assertEquals("Most using Facebook", user1Publish);
    }
}
