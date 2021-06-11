package org.vulcan.light.designpattern.structural.adapter.example;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public class SquarePeg {

    private double width;

    public SquarePeg() {

    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
