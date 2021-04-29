package org.vulcan.light.designpattern.creational.factorymethod.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

}
