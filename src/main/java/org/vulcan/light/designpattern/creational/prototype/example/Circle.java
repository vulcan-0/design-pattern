package org.vulcan.light.designpattern.creational.prototype.example;

/**
 * @author Sam Lu
 * @date 2021/6/10
 */
public class Circle extends Shape {

    public int radius;

    public Circle() {

    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) {
            return false;
        }
        Circle circle = (Circle) object;
        return radius == circle.radius;
    }

}
