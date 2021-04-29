package org.vulcan.light.designpattern.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.getLogger();
        fileLogger.writeLog();

        LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseLoggerFactory.getLogger();
        databaseLogger.writeLog();
    }

}
