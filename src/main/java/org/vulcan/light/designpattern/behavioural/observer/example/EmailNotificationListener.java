package org.vulcan.light.designpattern.behavioural.observer.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
