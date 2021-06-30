package org.vulcan.light.designpattern.behavioural.observer.definition.object;

/**
 * @author Sam Lu
 * @date 2021/6/30
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());
        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("start");
        subject.notifyObserver();
        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());

        subject.setState("end");
        subject.notifyObserver();
        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());
    }

}
