package org.vulcan.light.designpattern.behavioural.chainofresponsibility.example;

/**
 * @author Sam Lu
 * @date 2021/6/23
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }

}
