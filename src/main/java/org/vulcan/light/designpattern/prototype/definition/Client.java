package org.vulcan.light.designpattern.prototype.definition;

/**
 * @author Sam Lu
 * @date 2021/4/29
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype10 = new ConcretePrototype1();
        Prototype prototype11 = prototype10.clone();
        Prototype prototype20 = new ConcretePrototype2();
        Prototype prototype21 = prototype20.clone();
        System.out.println(prototype10);
        System.out.println(prototype11);
        System.out.println(prototype20);
        System.out.println(prototype21);
    }

}
