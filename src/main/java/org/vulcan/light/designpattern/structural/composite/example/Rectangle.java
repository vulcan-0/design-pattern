package org.vulcan.light.designpattern.structural.composite.example;

import java.awt.*;

/**
 * @author Sam Lu
 * @date 2021/6/16
 */
public class Rectangle extends BaseShape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(getX(), getY(), getWidth() - 1, getHeight() - 1);
    }

}
