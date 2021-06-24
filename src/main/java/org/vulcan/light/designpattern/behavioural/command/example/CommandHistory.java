package org.vulcan.light.designpattern.behavioural.command.example;

import java.util.Stack;

/**
 * @author Sam Lu
 * @date 2021/6/24
 */
public class CommandHistory {

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

}
