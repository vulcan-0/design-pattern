package org.vulcan.light.designpattern.behavioural.strategy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/1
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.contextInterface();
        context.setStrategy(new ConcreteStrategyB());
        context.contextInterface();
        context.setStrategy(new ConcreteStrategyC());
        context.contextInterface();
    }

}
