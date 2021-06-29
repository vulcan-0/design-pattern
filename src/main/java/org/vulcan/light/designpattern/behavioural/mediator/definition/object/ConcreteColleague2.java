package org.vulcan.light.designpattern.behavioural.mediator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class ConcreteColleague2 implements Colleague {

    private String name;

    public ConcreteColleague2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void say(String message) {
        System.out.println("[ConcreteColleague2 -> " + name + "]: " + message);
    }

}
