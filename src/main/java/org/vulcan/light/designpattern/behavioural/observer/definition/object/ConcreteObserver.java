package org.vulcan.light.designpattern.behavioural.observer.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/30
 */
public class ConcreteObserver implements Observer {

    private String observerState;
    public ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getState();
    }

    public String getObserverState() {
        return observerState;
    }

}
