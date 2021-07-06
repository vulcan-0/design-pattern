package org.vulcan.light.designpattern.behavioural.memento.example;

/**
 * @author Sam Lu
 * @date 2021/7/6
 */
public interface Command {

    /**
     * 获取名称
     *
     * @return
     */
    String getName();

    /**
     * 执行命令
     */
    void execute();

}
