package org.vulcan.light.designpattern.behavioural.observer.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/30
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getState() {
        return subjectState;
    }

    public void setState(String state) {
        subjectState = state;
    }

}
