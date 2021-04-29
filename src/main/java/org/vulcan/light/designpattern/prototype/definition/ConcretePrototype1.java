package org.vulcan.light.designpattern.prototype.definition;

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
