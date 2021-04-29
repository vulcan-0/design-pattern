package org.vulcan.light.designpattern.creational.factorymethod.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public abstract class Creator {

    /**
     * 创建产品
     *
     * @return
     */
    abstract Product factoryMethod();

    public Product anOperation() {
        Product product = factoryMethod();
        return product;
    }

}
