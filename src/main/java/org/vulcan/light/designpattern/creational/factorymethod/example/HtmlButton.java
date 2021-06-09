package org.vulcan.light.designpattern.creational.factorymethod.example;

/**
 * @author Sam Lu
 * @date 2021/6/9
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }

}
