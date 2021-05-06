package org.vulcan.light.designpattern.creational.singleton.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/6
 */
public class Singleton {

    private static final Singleton uniqueInstance = new Singleton();

    private String singletonData = "data";

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void singletonOperation() {
        System.out.println("Singleton Data: " + singletonData);
    }

    public String getSingletomData() {
        return singletonData;
    }

}
