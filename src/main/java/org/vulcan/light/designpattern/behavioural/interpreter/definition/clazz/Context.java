package org.vulcan.light.designpattern.behavioural.interpreter.definition.clazz;

/**
 * @author Sam Lu
 * @date 2021/5/28
 */
public class Context {

    private StringBuffer content = new StringBuffer();

    public void append(String text) {
        this.content.append(text);
    }

    @Override
    public String toString() {
        return content.toString();
    }

}
