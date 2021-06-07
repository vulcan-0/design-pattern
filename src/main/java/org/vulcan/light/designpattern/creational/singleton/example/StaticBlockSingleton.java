package org.vulcan.light.designpattern.creational.singleton.example;

/**
 * 饿汉式 - 静态代码块
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
