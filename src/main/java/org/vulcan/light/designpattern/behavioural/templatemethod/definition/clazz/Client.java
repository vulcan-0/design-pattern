package org.vulcan.light.designpattern.behavioural.templatemethod.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/7/2
 */
public class Client {

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }

}
