package org.vulcan.light.designpattern.behavioural.mediator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public interface Colleague {

    /**
     * 获取名字
     *
     * @return
     */
    String getName();

    /**
     * 说
     *
     * @param message
     */
    void say(String message);

}
