package org.vulcan.light.designpattern.structural.composite.definition.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Lu
 * @date 2021/5/18
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("Composite operation.");
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

}
