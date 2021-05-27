package org.vulcan.light.designpattern.behavioural.chainofresponsibility.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public boolean handleRequest(int num) {
        if (num == 1) {
            System.out.println("Handle by ConcreteHandler1.");
            return true;
        }
        if (handler == null) {
            System.out.println("Handle by ConcreteHandler1, but fail.");
            return false;
        }
        return handler.handleRequest(num);
    }

}
