package org.vulcan.light.designpattern.creational.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class FileLoggerFactory extends LoggerFactory {

    @Override
    protected Logger createLogger() {
        return new FileLogger();
    }

}
