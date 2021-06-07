package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/28
 */
public class TerminalExpression implements AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.append("[Terminal]");
    }

}
