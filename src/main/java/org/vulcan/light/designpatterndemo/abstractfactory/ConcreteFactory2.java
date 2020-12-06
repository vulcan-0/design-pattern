package org.vulcan.light.designpatterndemo.abstractfactory;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}
