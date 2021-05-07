package org.vulcan.light.designpattern.structural.bridge.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/7
 */
public class Abstraction {

    private Implementor imp;

    public void setImp(Implementor imp) {
        this.imp = imp;
    }

    public void operation() {
        imp.operationImpl();
    }

}
