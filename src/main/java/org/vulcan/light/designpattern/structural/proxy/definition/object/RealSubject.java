package org.vulcan.light.designpattern.structural.proxy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/26
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject request.");
    }

}
