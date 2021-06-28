package org.vulcan.light.designpattern.behavioural.interpreter.example;

/**
 * @author Sam Lu
 * @date 2021/6/28
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

}
