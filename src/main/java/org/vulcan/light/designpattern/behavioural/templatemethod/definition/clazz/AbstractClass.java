package org.vulcan.light.designpattern.behavioural.templatemethod.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/7/2
 */
public abstract class AbstractClass {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * 操作1
     */
    protected abstract void primitiveOperation1();

    /**
     * 操作2
     */
    protected abstract void primitiveOperation2();

}
