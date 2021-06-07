package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/28
 */
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression expression;

    @Override
    public void interpret(Context context) {
        context.append("Nonterminal ");
        if (expression != null) {
            expression.interpret(context);
        }
    }

    public void setExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

}
