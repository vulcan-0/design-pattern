package org.vulcan.light.designpattern.creational.singleton.example1;

/**
 * 饿汉式
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    /**
     * private constructor to avoid client applications to use constructor
     */
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
