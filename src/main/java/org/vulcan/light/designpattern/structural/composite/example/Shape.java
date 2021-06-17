package org.vulcan.light.designpattern.structural.composite.example;

import java.awt.*;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public interface Shape {

    /**
     * 获取x坐标
     *
     * @return
     */
    int getX();

    /**
     * 获取y坐标
     *
     * @return
     */
    int getY();

    /**
     * 获取宽度
     *
     * @return
     */
    int getWidth();

    /**
     * 获取高度
     *
     * @return
     */
    int getHeight();

    /**
     * 移动
     *
     * @param x
     * @param y
     */
    void move(int x, int y);

    /**
     * 坐标是否在组件之中
     *
     * @param x
     * @param y
     * @return
     */
    boolean isInsideBounds(int x, int y);

    /**
     * 选中
     */
    void select();

    /**
     * 取消选中
     */
    void unSelect();

    /**
     * 是否选中
     *
     * @return
     */
    boolean isSelected();

    /**
     * 绘制
     *
     * @param graphics
     */
    void paint(Graphics graphics);

}
