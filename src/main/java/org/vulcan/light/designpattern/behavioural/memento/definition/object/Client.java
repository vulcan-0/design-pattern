package org.vulcan.light.designpattern.behavioural.memento.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("Bent out of shape");
        caretaker.push(originator.createMemento());
        originator.setState("On cloud nine");
        caretaker.push(originator.createMemento());
        originator.setState("Spaced out");
        caretaker.push(originator.createMemento());
        originator.setState("Shaken up");
        caretaker.push(originator.createMemento());
        originator.setState("On pins and needles");
        caretaker.push(originator.createMemento());

        originator.setMemento(caretaker.pop());
        System.out.println(originator.getState());
        originator.setMemento(caretaker.pop());
        System.out.println(originator.getState());
        originator.setMemento(caretaker.pop());
        System.out.println(originator.getState());
        originator.setMemento(caretaker.pop());
        System.out.println(originator.getState());
        originator.setMemento(caretaker.pop());
        System.out.println(originator.getState());
    }

}
