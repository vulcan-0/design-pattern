package org.vulcan.light.designpattern.creational.abstractfactory.example;

/**
 * @author Sam Lu
 * @date 2021/6/8
 */
public class MacOSGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
