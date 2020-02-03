package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
//    private static  Logger logger;
//
//    @BeforeClass
//    public static void logging() {
//        logger = new Logger();
//        logger.log("First logging");
//    }
//
//    @Test
//    public void testLogger() {
//        //Given
//        //When
//        String logName = logger.getLastLog();
//        System.out.println("Log: " + logName);
//        //Then
//        Assert.assertEquals("First logging", logName);
//    }
    @BeforeClass
    public static void logging() {
        Logger.getInstance().log("First logging");
    }

    @Test
    public void testLogger() {
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Log: " + logName);
        //Then
        Assert.assertEquals("First logging", logName);
    }
}
