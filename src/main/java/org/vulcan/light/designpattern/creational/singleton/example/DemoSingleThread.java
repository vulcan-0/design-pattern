package org.vulcan.light.designpattern.creational.singleton.example;

/**
 * 单例模式示例
 *
 * @author Sam Lu
 * @date 2021/6/9
 * @see java.lang.Runtime#getRuntime()
 * @see java.awt.Desktop#getDesktop()
 * @see java.lang.System#getSecurityManager()
 */
public class DemoSingleThread {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }

}
