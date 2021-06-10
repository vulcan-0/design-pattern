package org.vulcan.light.designpattern.creational.prototype.example;

import java.util.Objects;

/**
 * @author Sam Lu
 * @date 2021/6/10
 */
public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    @Override
    public abstract Shape clone();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) object;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

}
