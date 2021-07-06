package org.vulcan.light.designpattern.behavioural.memento.example;

import java.awt.*;
import java.io.Serializable;

/**
 * @author Sam Lu
 * @date 2021/7/6
 */
public interface Shape extends Serializable {

    /**
     * 获取横坐标
     *
     * @return
     */
    int getX();

    /**
     * 获取纵坐标
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
     * 拖动
     */
    void drag();

    /**
     * 释放
     */
    void drop();

    /**
     * 移动到
     *
     * @param x
     * @param y
     */
    void moveTo(int x, int y);

    /**
     * 移动
     *
     * @param x
     * @param y
     */
    void moveBy(int x, int y);

    /**
     * 是否在范围内
     *
     * @param x
     * @param y
     * @return
     */
    boolean isInsideBounds(int x, int y);

    /**
     * 获取颜色
     *
     * @return
     */
    Color getColor();

    /**
     * 设置颜色
     *
     * @param color
     */
    void setColor(Color color);

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
