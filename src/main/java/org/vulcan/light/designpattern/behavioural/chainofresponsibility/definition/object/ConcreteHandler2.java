package org.vulcan.light.designpattern.behavioural.chainofresponsibility.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public boolean handleRequest(int num) {
        if (num == 2) {
            System.out.println("Handle by ConcreteHandler2.");
            return true;
        }
        if (handler == null) {
            System.out.println("Handle by ConcreteHandler2, but fail.");
            return false;
        }
        return handler.handleRequest(num);
    }

}
