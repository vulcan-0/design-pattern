package org.vulcan.light.designpattern.creational.abstractfactory.definition;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public interface AbstractFactory {

    /**
     * Create a ProductA
     *
     * @return
     */
    AbstractProductA createProductA();

    /**
     * Create a ProductB
     *
     * @return
     */
    AbstractProductB createProductB();

}
