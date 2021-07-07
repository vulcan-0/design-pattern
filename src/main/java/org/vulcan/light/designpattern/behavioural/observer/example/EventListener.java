package org.vulcan.light.designpattern.behavioural.observer.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public interface EventListener {

    void update(String eventType, File file);

}
