package org.vulcan.light.designpattern.structural.flyweight.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class Client {

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight(ConcreteFlyweight.class);
        flyweight1.operation();
        Flyweight flyweight2 = FlyweightFactory.getFlyweight(ConcreteFlyweight.class);
        flyweight2.operation();
        Flyweight flyweight3 = FlyweightFactory.getFlyweight(ConcreteFlyweight.class);
        flyweight3.operation();
        FlyweightFactory.release(flyweight1);
        Flyweight flyweight4 = FlyweightFactory.getFlyweight(ConcreteFlyweight.class);
        flyweight4.operation();

        Flyweight unsharedFlyweight = FlyweightFactory.getFlyweight(UnsharedConcreteFlyweight.class);
        unsharedFlyweight.operation();
    }

}
