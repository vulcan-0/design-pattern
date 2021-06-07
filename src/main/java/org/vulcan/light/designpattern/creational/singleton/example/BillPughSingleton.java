package org.vulcan.light.designpattern.creational.singleton.example;

/**
 * 静态内部类
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
