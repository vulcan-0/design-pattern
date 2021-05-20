package org.vulcan.light.designpattern.structural.decorator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/20
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        ((ConcreteDecoratorA) decoratorA).setAddedState(true);
        System.out.println(((ConcreteDecoratorA) decoratorA).isAddedState());

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
        ((ConcreteDecoratorB) decoratorB).addedBehavior();
    }

}
