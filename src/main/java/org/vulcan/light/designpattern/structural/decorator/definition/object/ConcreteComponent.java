package org.vulcan.light.designpattern.structural.decorator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/20
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("Concrete Component operation");
    }

}
