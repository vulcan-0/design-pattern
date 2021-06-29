package org.vulcan.light.designpattern.behavioural.mediator.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class Client {

    public static void main(String[] args) {
        Colleague colleague1 = new ConcreteColleague1("Sam");
        Colleague colleague2 = new ConcreteColleague2("Zoe");
        Mediator mediator = new ConcreteMediator(colleague1, colleague2);
        mediator.talk();
    }

}
