package org.vulcan.light.designpattern.behavioural.visitor.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/3
 */
public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitor2");
        concreteElementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitor2");
        concreteElementB.operationB();
    }

}
