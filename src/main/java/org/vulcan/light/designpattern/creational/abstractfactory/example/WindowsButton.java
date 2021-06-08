package org.vulcan.light.designpattern.creational.abstractfactory.example;

/**
 * @author Sam Lu
 * @date 2021/6/8
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }

}
