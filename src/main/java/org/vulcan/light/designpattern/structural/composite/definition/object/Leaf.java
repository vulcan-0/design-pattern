package org.vulcan.light.designpattern.structural.composite.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/18
 */
public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Leaf operation.");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

}
