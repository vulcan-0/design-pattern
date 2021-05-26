package org.vulcan.light.designpattern.structural.bridge.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/7
 */
public class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("Operation B.");
    }

}
