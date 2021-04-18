package org.vulcan.light.designpattern.factorymethod;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }

}
