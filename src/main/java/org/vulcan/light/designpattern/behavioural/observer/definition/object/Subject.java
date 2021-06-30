package org.vulcan.light.designpattern.behavioural.observer.definition.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Lu
 * @date 2021/6/30
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
