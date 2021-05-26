package org.vulcan.light.designpattern.structural.proxy.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/26
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }

}
