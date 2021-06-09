package org.vulcan.light.designpattern.creational.factorymethod.example1;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public abstract class LoggerFactory {

    /**
     * Get a Logger
     *
     * @return
     */
    public Logger getLogger() {
        Logger logger = createLogger();
        return logger;
    }

    /**
     * Create a Logger
     *
     * @return
     */
    protected abstract Logger createLogger();

}
