package org.vulcan.light.designpattern.creational.singleton.example1;

/**
 * 懒汉式 - 线程安全
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
