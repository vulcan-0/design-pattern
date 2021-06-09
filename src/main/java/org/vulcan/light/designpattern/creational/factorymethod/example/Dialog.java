package org.vulcan.light.designpattern.creational.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2021/6/9
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 创建按钮
     *
     * @return
     */
    protected abstract Button createButton();

}
