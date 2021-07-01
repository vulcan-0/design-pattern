package org.vulcan.light.designpattern.behavioural.strategy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("Strategy A");
    }

}
