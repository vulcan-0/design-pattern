package org.vulcan.light.designpattern.behavioural.observer.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
