package org.vulcan.light.designpattern.factorymethod;

import java.sql.*;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class Client {

    public static void main(String[] args) throws SQLException {
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.writeLog();

        LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = databaseLoggerFactory.createLogger();
        databaseLogger.writeLog();

        // JDK example
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user_info");
    }

}
