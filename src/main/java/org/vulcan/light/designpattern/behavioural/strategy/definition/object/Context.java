package org.vulcan.light.designpattern.behavioural.strategy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class Context {

    private Strategy strategy;

    public void contextInterface() {
        strategy.algorithmInterface();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
