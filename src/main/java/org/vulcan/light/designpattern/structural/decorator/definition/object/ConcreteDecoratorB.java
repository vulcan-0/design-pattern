package org.vulcan.light.designpattern.structural.decorator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/20
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addedBehavior() {
        System.out.println("Concrete Decorator B added behavior");
    }

}
