package org.vulcan.light.designpattern.behavioural.memento.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

}
