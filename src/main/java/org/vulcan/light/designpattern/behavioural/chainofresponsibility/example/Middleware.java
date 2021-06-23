package org.vulcan.light.designpattern.behavioural.chainofresponsibility.example;

/**
 * @author Sam Lu
 * @date 2021/6/23
 */
public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * 校验
     *
     * @param email
     * @param password
     * @return
     */
    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

}
