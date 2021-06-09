package org.vulcan.light.designpattern.creational.singleton.example1;

/**
 * 懒汉式
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
