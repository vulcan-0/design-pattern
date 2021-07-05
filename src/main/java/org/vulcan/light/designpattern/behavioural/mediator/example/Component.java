package org.vulcan.light.designpattern.behavioural.mediator.example;

/**
 * @author Sam Lu
 * @date 2021/7/5
 */
public interface Component {

    /**
     * 设置中介者
     *
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 获取名字
     *
     * @return
     */
    String getName();

}
