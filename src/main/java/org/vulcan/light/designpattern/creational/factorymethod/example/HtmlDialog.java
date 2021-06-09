package org.vulcan.light.designpattern.creational.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2021/6/9
 */
public class HtmlDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }

}
