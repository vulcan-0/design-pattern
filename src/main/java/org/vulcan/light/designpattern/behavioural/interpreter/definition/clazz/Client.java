package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/6/7
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        NonterminalExpression expression = new NonterminalExpression();

        NonterminalExpression nonterminalExpression = new NonterminalExpression();
        expression.setExpression(nonterminalExpression);

        TerminalExpression terminalExpression = new TerminalExpression();
        nonterminalExpression.setExpression(terminalExpression);

        expression.interpret(context);
        System.out.println(context.toString());
    }

}
