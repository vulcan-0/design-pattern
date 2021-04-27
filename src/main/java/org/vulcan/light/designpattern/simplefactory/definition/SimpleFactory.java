package org.vulcan.light.designpattern.simplefactory.definition;

/**
 * @author Sam Lu
 * @createdOn 2020/12/6
 */
public class SimpleFactory {

    public static Product createProduct(String name) {
        if (ConcreteProductA.NAME.equals(name)) {
            return new ConcreteProductA();
        } else if (ConcreteProductB.NAME.equals(name)) {
            return new ConcreteProductB();
        }
        return null;
    }

}
