package org.vulcan.light.designpatterndemo.factorymethod;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("Write log to file.");
    }

}
