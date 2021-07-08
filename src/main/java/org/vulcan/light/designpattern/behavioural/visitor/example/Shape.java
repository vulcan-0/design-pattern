package org.vulcan.light.designpattern.behavioural.visitor.example;

/**
 * @author Sam Lu
 * @date 2021/7/8
 */
public interface Shape {

    /**
     * 移动
     *
     * @param x
     * @param y
     */
    void move(int x, int y);

    /**
     * 绘制
     */
    void draw();

    /**
     * 接收访问者
     *
     * @param visitor
     * @return
     */
    String accept(Visitor visitor);

}
