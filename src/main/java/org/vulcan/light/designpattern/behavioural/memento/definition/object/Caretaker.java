package org.vulcan.light.designpattern.behavioural.memento.definition.object;

import java.util.Stack;

/**
 * @author Sam Lu
 * @date 2021/6/29
 */
public class Caretaker {

    private Stack<Memento> stack = new Stack<>();

    public void push(Memento memento) {
        stack.push(memento);
    }

    public Memento pop() {
        return stack.pop();
    }

}
