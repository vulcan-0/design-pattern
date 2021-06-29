package org.vulcan.light.designpattern.behavioural.mediator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class ConcreteMediator implements Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public ConcreteMediator(Colleague colleague1, Colleague colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    @Override
    public void talk() {
        colleague1.say("Hello, " + colleague2.getName() + "!");
        colleague2.say("Hi, " + colleague1.getName() + "!");
        colleague1.say("Nice to meet you.");
        colleague2.say("Nice to meet you too.");
    }

}
