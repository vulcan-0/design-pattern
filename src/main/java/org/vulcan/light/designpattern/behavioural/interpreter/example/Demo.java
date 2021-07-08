package org.vulcan.light.designpattern.behavioural.interpreter.example;

/**
 * 解析器模式示例代码
 *
 * @author Sam Lu
 * @date 2021/6/28
 */
public class Demo {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Jule"));
    }

    private static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new OrExpression(julie, married);
    }

}
