package org.vulcan.light.designpattern.abstractfactory.definition;

/**
 * @author Sam Lu
 * @createdOn 2020/12/6
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
