package org.vulcan.light.designpattern.structural.adapter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/6
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
