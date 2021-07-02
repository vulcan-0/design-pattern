package org.vulcan.light.designpattern.behavioural.templatemethod.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/7/2
 */
public class ConcreteClass extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("Concrete Class Operation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Concrete Class Operation2");
    }

}
