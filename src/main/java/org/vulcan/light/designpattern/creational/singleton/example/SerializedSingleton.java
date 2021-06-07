package org.vulcan.light.designpattern.creational.singleton.example;

import java.io.Serializable;

/**
 * 序列化
 *
 * @author Sam Lu
 * @date 2021/6/7
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {}

    private static class SingletonHelper {

        private static final SerializedSingleton instance = new SerializedSingleton();

    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * Avoid to create a new instance of the class when serialized and deserialize it
     *
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

}
