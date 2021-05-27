package org.vulcan.light.designpattern.behavioural.chainofresponsibility.definition.object;

/**
 * @author Sam Lu
 * @date 2021/5/27
 */
public class Handler {

    protected Handler handler;

    public boolean handleRequest(int num) {
        if (handler == null) {
            System.out.println("Handle by super Handler, but fail.");
            return false;
        }
        return handler.handleRequest(num);
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
