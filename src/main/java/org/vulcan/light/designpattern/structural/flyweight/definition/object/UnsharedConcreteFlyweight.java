package org.vulcan.light.designpattern.structural.flyweight.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    @Override
    public void operation() {
        System.out.println("UnsharedConcreteFlyweight operation.");
    }

}
