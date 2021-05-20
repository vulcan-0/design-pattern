package org.vulcan.light.designpattern.structural.decorator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/20
 */
public class ConcreteDecoratorA extends Decorator {

    private boolean addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public boolean isAddedState() {
        return addedState;
    }

    public void setAddedState(boolean addedState) {
        this.addedState = addedState;
    }

}
