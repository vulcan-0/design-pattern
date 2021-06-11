package org.vulcan.light.designpattern.structural.bridge.example;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public interface Remote {

    /**
     * 开关
     */
    void power();

    /**
     * 调小音量
     */
    void volumeDown();

    /**
     * 调大音量
     */
    void volumeUp();

    /**
     * 往下翻一个频道
     */
    void channelDown();

    /**
     * 往上翻一个频道
     */
    void channelUp();

}
