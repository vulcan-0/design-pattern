package org.vulcan.light.designpattern.structural.bridge.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/7
 */
public class Client {

    public static void main(String[] args) {
        Abstraction abstraction1 = new RefinedAbstraction();
        Implementor implementorA = new ConcreteImplementorA();
        abstraction1.setImp(implementorA);
        ((RefinedAbstraction) abstraction1).operate();

        Abstraction abstraction2 = new RefinedAbstraction();
        Implementor implementorB = new ConcreteImplementorB();
        abstraction2.setImp(implementorB);
        ((RefinedAbstraction) abstraction2).operate();
    }

}
