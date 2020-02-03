package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
//    private static  Logger logger;
//
//    @Test
//    public void testLogger() {
//        //Given
//    logger = new Logger();
//        logger.log("First logging");
//        //When
//        String logName = logger.getLastLog();
//        System.out.println("Log: " + logName);
//        //Then
//        Assert.assertEquals("First logging", logName);
//    }

    @Test
    public void testLogger() {
        //Given
        Logger.getInstance().log("First logging");
        //When
        String logName = Logger.getInstance().getLastLog();
        System.out.println("Log: " + logName);
        //Then
        Assert.assertEquals("First logging", logName);
    }
}
