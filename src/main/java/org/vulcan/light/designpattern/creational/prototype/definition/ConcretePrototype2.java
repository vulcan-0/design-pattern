package org.vulcan.light.designpattern.creational.prototype.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class ConcretePrototype2 implements Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }

}
