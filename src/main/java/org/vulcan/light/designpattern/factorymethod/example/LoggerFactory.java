package org.vulcan.light.designpattern.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public interface LoggerFactory {

    /**
     * Create a Logger
     *
     * @return
     */
    Logger createLogger();

}
