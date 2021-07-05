package org.vulcan.light.designpattern.behavioural.visitor.definition.object;

/**
 * @author Sam Lu
 * @date 2021/7/3
 */
public interface Element {

    /**
     * 接收访问者
     *
     * @param visitor
     */
    void accept(Visitor visitor);

}
