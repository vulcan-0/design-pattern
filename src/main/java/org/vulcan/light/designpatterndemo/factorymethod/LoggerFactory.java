package org.vulcan.light.designpatterndemo.factorymethod;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public interface LoggerFactory {

    /**
     * create a Logger
     *
     * @return
     */
    Logger createLogger();

}
