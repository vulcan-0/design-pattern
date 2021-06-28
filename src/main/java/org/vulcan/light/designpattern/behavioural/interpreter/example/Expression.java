package org.vulcan.light.designpattern.behavioural.interpreter.example;

/**
 * @author Sam Lu
 * @date 2021/6/28
 */
public interface Expression {

    /**
     * 语法解析
     *
     * @param context
     * @return
     */
    boolean interpret(String context);

}
