package org.vulcan.light.designpattern.creational.simplefactory.definition.object;

/**
 * @author Sam Lu
 * @date 2020/12/6
 */
public class Client {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();
        Product productB = SimpleFactory.createProduct("B");
        productB.use();
    }

}
