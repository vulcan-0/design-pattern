package org.vulcan.light.designpattern.behavioural.visitor.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/3
 */
public interface Visitor {

    /**
     * 访问ConcreteElementA
     *
     * @param concreteElementA
     */
    void visitConcreteElementA(ConcreteElementA concreteElementA);

    /**
     * 访问ConcreteElementB
     *
     * @param concreteElementB
     */
    void visitConcreteElementB(ConcreteElementB concreteElementB);

}
