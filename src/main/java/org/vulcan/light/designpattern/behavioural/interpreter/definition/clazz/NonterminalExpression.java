package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/28
 */
public class NonterminalExpression extends AbstractExpression {

    private TerminalExpression terminalExpression;

    @Override
    public void interpret(Context context) {

    }

    public void setTerminalExpression(TerminalExpression terminalExpression) {
        this.terminalExpression = terminalExpression;
    }

    public TerminalExpression getTerminalExpression() {
        return terminalExpression;
    }

}
