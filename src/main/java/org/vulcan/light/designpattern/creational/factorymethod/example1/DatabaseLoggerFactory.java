package org.vulcan.light.designpattern.creational.factorymethod.example1;

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
