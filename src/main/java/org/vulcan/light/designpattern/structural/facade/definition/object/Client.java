package org.vulcan.light.designpattern.structural.facade.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new ConcreteFacade();
        facade.operation();
    }

}
