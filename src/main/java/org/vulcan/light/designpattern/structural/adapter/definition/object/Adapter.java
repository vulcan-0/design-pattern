package org.vulcan.light.designpattern.structural.adapter.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/6
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
