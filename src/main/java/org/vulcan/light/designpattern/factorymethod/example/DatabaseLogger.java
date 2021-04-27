package org.vulcan.light.designpattern.factorymethod.example;

/**
 * @author Sam Lu
 * @createdOn 2020/12/6
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("Write log to database.");
    }

}
