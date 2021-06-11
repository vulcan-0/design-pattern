package org.vulcan.light.designpattern.structural.bridge.example;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public interface Device {

    /**
     * 是否开着
     *
     * @return
     */
    boolean isEnabled();

    /**
     * 开
     */
    void enable();

    /**
     * 关
     */
    void disable();

    /**
     * 获取音量
     *
     * @return
     */
    int getVolume();

    /**
     * 设置音量
     *
     * @param volume
     */
    void setVolume(int volume);

    /**
     * 获取频道
     *
     * @return
     */
    int getChannel();

    /**
     * 设置频道
     *
     * @param channel
     */
    void setChannel(int channel);

    /**
     * 打印状态
     */
    void printStatus();

}
