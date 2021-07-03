package org.vulcan.light.designpattern.behavioural.visitor.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/3
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        System.out.println("Concrete Element A operation");
    }

}
