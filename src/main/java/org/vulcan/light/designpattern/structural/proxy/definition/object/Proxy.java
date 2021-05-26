package org.vulcan.light.designpattern.structural.proxy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/26
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("Log by Proxy request.");
        subject.request();
    }

}
