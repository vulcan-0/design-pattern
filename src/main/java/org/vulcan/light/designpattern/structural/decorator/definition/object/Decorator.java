package org.vulcan.light.designpattern.structural.decorator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/20
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("Decorator operation");
    }

}
