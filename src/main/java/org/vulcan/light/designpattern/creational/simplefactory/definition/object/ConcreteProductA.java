package org.vulcan.light.designpattern.creational.simplefactory.definition.object;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class ConcreteProductA implements Product {

    public static String NAME = "A";

    @Override
    public void use() {
        System.out.println("Use Product A.");
    }

}
