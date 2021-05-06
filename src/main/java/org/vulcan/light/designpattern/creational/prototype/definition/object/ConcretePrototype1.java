package org.vulcan.light.designpattern.creational.prototype.definition.object;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class ConcretePrototype1 implements Prototype {

    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }

}
