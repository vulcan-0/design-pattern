package org.vulcan.light.designpattern.creational.abstractfactory.definition.object;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
