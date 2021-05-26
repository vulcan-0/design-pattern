package org.vulcan.light.designpattern.structural.bridge.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/7
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println("Operation A.");
    }

}
