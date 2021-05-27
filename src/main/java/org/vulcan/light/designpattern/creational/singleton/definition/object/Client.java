package org.vulcan.light.designpattern.creational.singleton.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/6
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.singletonOperation();
        System.out.println("The data of singleton is: " + singleton.getSingletonData());
    }

}
