package org.vulcan.light.designpattern.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    protected Logger createLogger() {
        return new DatabaseLogger();
    }

}
