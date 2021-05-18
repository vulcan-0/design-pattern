package org.vulcan.light.designpattern.structural.composite.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/18
 */
public class Client {

    public static void main(String[] args) {
        Composite composite = new Composite();
        Leaf leaf = new Leaf();
        composite.add(leaf);

        composite.operation();
        composite.getChild(0).operation();
    }

}
