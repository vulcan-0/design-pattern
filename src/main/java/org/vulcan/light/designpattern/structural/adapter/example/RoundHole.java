package org.vulcan.light.designpattern.structural.adapter.example;

/**
 * @author Sam Lu
 * @date 2021/6/11
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }

}
