package org.vulcan.light.designpattern.behavioural.visitor.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/3
 */
public class Client {

    public static void main(String[] args) {
        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();
        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();
        concreteElementA.accept(concreteVisitor1);
        concreteElementB.accept(concreteVisitor1);
        concreteElementA.accept(concreteVisitor2);
        concreteElementB.accept(concreteVisitor2);
    }

}
