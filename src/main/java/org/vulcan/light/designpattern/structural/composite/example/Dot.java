package org.vulcan.light.designpattern.structural.composite.example;

import java.awt.*;

/**
 * @author Sam Lu
 * @date 2021/6/16
 */
public class Dot extends BaseShape {

    private int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(getX() - 1, getY() - 1, getWidth(), getHeight());
    }

}
