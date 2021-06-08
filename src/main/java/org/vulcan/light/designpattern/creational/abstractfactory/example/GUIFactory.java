package org.vulcan.light.designpattern.creational.abstractfactory.example;

/**
 * @author Sam Lu
 * @date 2021/6/8
 */
public interface GUIFactory {

    /**
     * 创建按钮
     *
     * @return
     */
    Button createButton();

    /**
     * 创建复选框
     *
     * @return
     */
    Checkbox createCheckbox();

}
