package org.vulcan.light.designpattern.creational.abstractfactory.example;

/**
 * @author Sam Lu
 * @date 2021/6/8
 */
public class WindowsGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

}
