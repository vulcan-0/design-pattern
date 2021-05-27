package org.vulcan.light.designpattern.behavioural.chainofresponsibility.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class Client {

    public static void main(String[] args) {
        Handler handler = new Handler();
        System.out.println(handler.handleRequest(0));
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        System.out.println(handler.handleRequest(0));
        System.out.println(handler.handleRequest(1));
        System.out.println(handler.handleRequest(2));
    }

}
