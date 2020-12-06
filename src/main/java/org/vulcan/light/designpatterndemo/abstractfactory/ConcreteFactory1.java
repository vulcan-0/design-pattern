package org.vulcan.light.designpatterndemo.abstractfactory;

/**
 * @author luxiaocong
 * @createdOn 2020/12/6
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
