package org.vulcan.light.designpattern.structural.adapter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/6
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }

}
