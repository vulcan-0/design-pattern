package org.vulcan.light.designpattern.structural.flyweight.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight operation.");
    }

}
