package org.vulcan.light.designpattern.simplefactory.definition;

/**
 * @author Sam Lu
 * @createdOn 2020/12/6
 */
public class Main {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();
        Product productB = SimpleFactory.createProduct("B");
        productB.use();
    }

}
