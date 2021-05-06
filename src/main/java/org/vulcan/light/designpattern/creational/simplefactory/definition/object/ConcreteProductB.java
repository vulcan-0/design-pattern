package org.vulcan.light.designpattern.creational.simplefactory.definition.object;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class ConcreteProductB implements Product {

    public static String NAME = "B";

    @Override
    public void use() {
        System.out.println("Use Product B.");
    }

}
