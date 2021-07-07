package org.vulcan.light.designpattern.behavioural.observer.example;

import java.io.File;

/**
 * @author Sam Lu
 * @date 2021/7/7
 */
public interface EventListener {

    /**
     * 发生事件
     *
     * @param eventType
     * @param file
     */
    void update(String eventType, File file);

}
