package org.vulcan.light.designpattern.creational.singleton.example1;

/**
 * 懒汉式 - 线程安全 - 双重检查
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class ThreadSafeSingletonWithDoubleChecked {

    private static ThreadSafeSingletonWithDoubleChecked instance;

    private ThreadSafeSingletonWithDoubleChecked() {}

    public static synchronized ThreadSafeSingletonWithDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonWithDoubleChecked.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonWithDoubleChecked();
                }
            }
        }
        return instance;
    }

}
