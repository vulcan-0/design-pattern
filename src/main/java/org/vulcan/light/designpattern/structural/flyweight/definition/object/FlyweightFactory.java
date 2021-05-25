package org.vulcan.light.designpattern.structural.flyweight.definition.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Lu
 * @date 2021/5/25
 */
public class FlyweightFactory {

    private static List<Flyweight> freeFlyweights = new ArrayList<>();
    private static List<Flyweight> inUseFlyweights = new ArrayList<>();

    static {
        freeFlyweights.add(new ConcreteFlyweight());
        freeFlyweights.add(new ConcreteFlyweight());
        freeFlyweights.add(new ConcreteFlyweight());
    }

    public static Flyweight getFlyweight(Class<? extends Flyweight> clazz) {
        if (ConcreteFlyweight.class.equals(clazz)) {
            if (freeFlyweights.size() > 0) {
                Flyweight flyweight = freeFlyweights.get(0);
                freeFlyweights.remove(0);
                inUseFlyweights.add(flyweight);
                return flyweight;
            } else {
                throw new RuntimeException("Too many in use flyweight objects.");
            }
        } else if (UnsharedConcreteFlyweight.class.equals(clazz)) {
            return new UnsharedConcreteFlyweight();
        }
        return null;
    }

    public static void release(Flyweight flyweight) {
        inUseFlyweights.remove(flyweight);
        freeFlyweights.add(flyweight);
    }

}
