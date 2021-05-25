package org.vulcan.light.designpattern.structural.facade.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class ConcreteFacade implements Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    @Override
    public void operation() {
        subSystemA.operation1();
        subSystemB.operation3();
    }

}
