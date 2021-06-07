package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/28
 */
public interface AbstractExpression {

    /**
     * 语法解析
     *
     * @param context
     */
    void interpret(Context context);

}
